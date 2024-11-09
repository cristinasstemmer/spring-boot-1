package com.example.many_to_many.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.many_to_many.dto.CursoRequest;
import com.example.many_to_many.dto.CursoResponse;
import com.example.many_to_many.mapper.CursoMapper;
import com.example.many_to_many.model.Curso;
import com.example.many_to_many.repository.CursoRepository;

@Service
public class CursoService {

    @Autowired
    private CursoRepository cursoRepository;

    @Autowired
    private CursoMapper cursoMapper;

    public CursoResponse criarCurso(CursoRequest cursoRequest) {
        Curso curso = cursoMapper.toEntity(cursoRequest);
        curso = cursoRepository.save(curso);
        return cursoMapper.toResponse(curso);
    }

    public List<CursoResponse> listarCursos() {
        return cursoRepository.findAll().stream()
                .map(cursoMapper::toResponse)
                .collect(Collectors.toList());
    }
}
