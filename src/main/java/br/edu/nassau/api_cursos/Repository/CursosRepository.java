package br.edu.nassau.api_cursos.Repository;

import br.edu.nassau.api_cursos.Model.CursosModel;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Repository
public class CursosRepository {
    private final List<CursosModel> repository = new ArrayList<>();
    private Long contadoriD = 1L;

    public CursosModel cadastrar(CursosModel cursosModel){
        cursosModel.setId(contadoriD++);
        repository.add(cursosModel);
        return cursosModel;
    }

    public List<CursosModel> listar() {
        return repository;
    }

    public CursosModel buscarId(Long id) {
        return repository.stream()
                .filter(cursosModel -> Objects.equals (cursosModel.getId(), id))
                .findFirst()
                .orElse(null);
    }

    public CursosModel atualizar(Long id, CursosModel cursosModel) {
        return repository.stream()
                .filter(CursosModel -> Objects.equals (CursosModel.getId(), id))
                .findFirst()
                .map(cursoAtualizado -> {
                    cursoAtualizado.setNome(cursosModel.getNome());
                    cursoAtualizado.setCargaHoraria(cursosModel.getCargaHoraria());
                    return cursoAtualizado;
                })
                .orElse(null);
    }

    public boolean remover(Long id) {
        return repository.removeIf(CursosModel -> Objects.equals (CursosModel.getId(), id));
    }

}
