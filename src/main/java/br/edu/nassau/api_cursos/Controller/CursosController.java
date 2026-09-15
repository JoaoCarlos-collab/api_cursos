package br.edu.nassau.api_cursos.Controller;

import br.edu.nassau.api_cursos.Model.CursosModel;
import br.edu.nassau.api_cursos.Service.CursosService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CursosController {
    private final CursosService cursosService;

    public CursosController(CursosService cursosService) {
        this.cursosService = cursosService;
    }
    @PostMapping("/cadastrar")
    public CursosModel cadastrar(@RequestBody CursosModel cursosModel){
        return cursosService.cadastrar(cursosModel);
    }

    @GetMapping("/buscarId/{id}")
    public CursosModel buscarId(@PathVariable Long id){
        return cursosService.buscarId(id);
    }

    @GetMapping("/listar")
    public List<CursosModel> Listar(){
        return cursosService.listar();
    }

    @PutMapping("/atualizar/{id}")
    public CursosModel atualizar(@PathVariable Long id, @RequestBody CursosModel cursosModel){
        return cursosService.atualizar(id, cursosModel);
    }

    @DeleteMapping("/deletar/{id}")
    public void deletar(@PathVariable Long id){
        cursosService.deletar(id);
    }


}
