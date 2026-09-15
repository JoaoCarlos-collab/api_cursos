package br.edu.nassau.api_cursos.Repository;

import br.edu.nassau.api_cursos.Model.CursosModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursosRepository extends JpaRepository<CursosModel, Long> {
}