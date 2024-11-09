package com.example.many_to_many.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.many_to_many.dto.CursoRequest;
import com.example.many_to_many.dto.CursoResponse;
import com.example.many_to_many.model.Curso;

@Component
public class CursoMapper {

    @Autowired
    private ModelMapper modelMapper;

    public CursoResponse toResponse(Curso curso) {
        return modelMapper.map(curso, CursoResponse.class);
    }

    public Curso toEntity(CursoRequest cursoRequest) {
        return modelMapper.map(cursoRequest, Curso.class);
    }
}

