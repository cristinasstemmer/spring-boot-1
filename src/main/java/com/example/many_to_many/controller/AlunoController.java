package com.example.many_to_many.controller;

import com.example.many_to_many.dto.AlunoRequest;
import com.example.many_to_many.dto.AlunoResponse;
import com.example.many_to_many.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    private AlunoService alunoService;

    @PostMapping
    public AlunoResponse adicionarAluno(@RequestBody AlunoRequest alunoRequest) {
        return alunoService.criarAluno(alunoRequest);
    }

    @GetMapping
    public List<AlunoResponse> listarAlunos() {
        return alunoService.listarAlunos();
    }
}
