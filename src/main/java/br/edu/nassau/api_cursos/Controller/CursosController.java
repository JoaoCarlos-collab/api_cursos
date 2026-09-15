package br.edu.nassau.api_cursos.Controller;

import br.edu.nassau.api_cursos.Service.CursosService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CursosController {
    private final CursosService cursosService;

    public CursosController(CursosService cursosService) {
        this.cursosService = cursosService;
    }

    @GetMapping("/cursos/mensagem")
    public String mensagem(){
        return cursosService.mensagem();
    }
}
