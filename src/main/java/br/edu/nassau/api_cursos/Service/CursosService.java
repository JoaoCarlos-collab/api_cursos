package br.edu.nassau.api_cursos.Service;

import br.edu.nassau.api_cursos.Model.CursosModel;
import br.edu.nassau.api_cursos.Repository.CursosRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class CursosService {

    private final CursosRepository cursosRepository;

    public CursosService(CursosRepository cursosRepository) {
        this.cursosRepository = cursosRepository;
    }

    public CursosModel cadastrar(CursosModel cursosModel) {
        if (cursosModel.getNome() == null || cursosModel.getNome().isBlank()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "O nome do curso é obrigatório!");
        }

        if (cursosModel.getCargaHoraria() == null || cursosModel.getCargaHoraria() <= 0) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "A carga horária deve ser maior que zero!");
        }

        return cursosRepository.save(cursosModel);
    }

    public List<CursosModel> listar() {
        return cursosRepository.findAll();
    }

    public CursosModel buscarId(Long id) {
        return cursosRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Curso não encontrado!"));
    }

    public CursosModel atualizar(Long id, CursosModel cursosModel) {
        if (cursosModel.getNome() == null || cursosModel.getNome().isBlank()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "O nome do curso é obrigatório!");
        }

        if (cursosModel.getCargaHoraria() == null || cursosModel.getCargaHoraria() <= 0) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "A carga horária deve ser maior que zero!");
        }

        CursosModel cursoExistente = buscarId(id);
        cursoExistente.setNome(cursosModel.getNome());
        cursoExistente.setCargaHoraria(cursosModel.getCargaHoraria());

        return cursosRepository.save(cursoExistente);
    }

    public void deletar(Long id) {
        CursosModel curso = buscarId(id);
        cursosRepository.delete(curso);
    }
}