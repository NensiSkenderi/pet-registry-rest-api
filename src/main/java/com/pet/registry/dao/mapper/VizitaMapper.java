package com.pet.registry.dao.mapper;


import com.pet.registry.dao.dto.VeterineriDto;
import com.pet.registry.dao.dto.VizitaDto;
import com.pet.registry.dao.model.Veterineri;
import com.pet.registry.dao.model.Vizita;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VizitaMapper {

    @Autowired
    private ModelMapper modelMapper;

    public Vizita convertToEntity(VizitaDto vizitaDto) {
        Vizita vizita = modelMapper.map(vizitaDto, Vizita.class);
        return vizita;
    }

    public VizitaDto convertToDTO(Vizita vizita){
        VizitaDto vizitaDto = modelMapper.map(vizita, VizitaDto.class);
        return vizitaDto;
    }

}
