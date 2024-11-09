package com.example.many_to_many.mapper;

import com.example.many_to_many.dto.AlunoRequest;
import com.example.many_to_many.dto.AlunoResponse;
import com.example.many_to_many.model.Aluno;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AlunoMapper {

    @Autowired
    private ModelMapper modelMapper;

    public AlunoResponse toResponse(Aluno aluno) {
        return modelMapper.map(aluno, AlunoResponse.class);
    }

    public Aluno toEntity(AlunoRequest alunoRequest) {
        return modelMapper.map(alunoRequest, Aluno.class);
    }
}
