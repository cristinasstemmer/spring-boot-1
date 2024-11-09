package com.example.many_to_many.controller;

import com.example.many_to_many.dto.CursoRequest;
import com.example.many_to_many.dto.CursoResponse;
import com.example.many_to_many.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cursos")
public class CursoController {

    @Autowired
    private CursoService cursoService;

    @PostMapping
    public CursoResponse adicionarCurso(@RequestBody CursoRequest cursoRequest) {
        return cursoService.criarCurso(cursoRequest);
    }

    @GetMapping
    public List<CursoResponse> listarCursos() {
        return cursoService.listarCursos();
    }
}
