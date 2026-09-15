package br.edu.nassau.api_cursos.Service;

import br.edu.nassau.api_cursos.Model.CursosModel;
import br.edu.nassau.api_cursos.Repository.CursosRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursosService {
    private final CursosRepository cursosRepository;

    public CursosService(CursosRepository cursosRepository) {
        this.cursosRepository = cursosRepository;
    }

    public CursosModel cadastrar(CursosModel cursosModel){
        if (cursosModel.getNome() == null || cursosModel.getNome().isBlank()) {
            throw new IllegalArgumentException("O nome do curso é obrigatório!");
        }

        if (cursosModel.getCargaHoraria() == null || cursosModel.getCargaHoraria() <= 0) {
            throw new IllegalArgumentException("A carga horária deve ser maior que zero!");
        }

        return cursosRepository.cadastrar(cursosModel);
    }

    public List<CursosModel> listar() {
        return cursosRepository.listar();
    }

    public CursosModel buscarId(Long id){
        return cursosRepository.buscarId(id);
    }

    public CursosModel atualizar(Long id, CursosModel cursosModel){
        if (cursosModel.getNome() == null || cursosModel.getNome().isBlank()) {
            throw new IllegalArgumentException("O nome do curso é obrigatório!");
        }

        if (cursosModel.getCargaHoraria() == null || cursosModel.getCargaHoraria() <= 0) {
            throw new IllegalArgumentException("A carga horária deve ser maior que zero!");
        }
        return cursosRepository.atualizar(id, cursosModel);
    }

    public boolean remover(Long id){
        return cursosRepository.remover(id);
    }
}
