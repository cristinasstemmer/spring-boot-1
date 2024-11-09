package com.example.many_to_many.service;

import com.example.many_to_many.dto.AlunoRequest;
import com.example.many_to_many.dto.AlunoResponse;
import com.example.many_to_many.mapper.AlunoMapper;
import com.example.many_to_many.model.Aluno;
import com.example.many_to_many.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository alunoRepository;

    @Autowired
    private AlunoMapper alunoMapper;

    public AlunoResponse criarAluno(AlunoRequest alunoRequest) {
        Aluno aluno = alunoMapper.toEntity(alunoRequest);
        aluno = alunoRepository.save(aluno);
        return alunoMapper.toResponse(aluno);
    }

    public List<AlunoResponse> listarAlunos() {
        return alunoRepository.findAll().stream()
                .map(alunoMapper::toResponse)
                .collect(Collectors.toList());
    }
}
