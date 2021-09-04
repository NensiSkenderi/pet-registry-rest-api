package com.pet.registry.dao.mapper;


import com.pet.registry.dao.dto.PronariDto;
import com.pet.registry.dao.model.Pronari;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PronariMapper {

    @Autowired
    private ModelMapper modelMapper;

    public PronariDto convertToDTO(Pronari pronari){
        PronariDto pronariDto = modelMapper.map(pronari, PronariDto.class);
        return pronariDto;
    }

    public Pronari convertToEntity(PronariDto pronariDto){
        Pronari pronari = modelMapper.map(pronariDto, Pronari.class);
        return pronari;
    }
}
