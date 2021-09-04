package com.pet.registry.dao.mapper;

import com.pet.registry.dao.dto.KafshetDto;
import com.pet.registry.dao.model.Kafshet;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class KafshetMapper {

    @Autowired
    private ModelMapper modelMapper;

    public KafshetDto convertToDTO(Kafshet kafshet){
        KafshetDto kafshetDto = modelMapper.map(kafshet, KafshetDto.class);
        return kafshetDto;
    }

    public Kafshet convertToEntity(KafshetDto kafshetDto){
        Kafshet kafshet = modelMapper.map(kafshetDto, Kafshet.class);
        return kafshet;
    }
}
