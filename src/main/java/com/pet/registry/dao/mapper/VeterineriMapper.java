package com.pet.registry.dao.mapper;


import com.pet.registry.dao.dto.VeterineriDto;
import com.pet.registry.dao.model.Veterineri;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VeterineriMapper {

    @Autowired
    private ModelMapper modelMapper;

    public Veterineri convertToEntity(VeterineriDto veterineriDto) {
        Veterineri veterineri = modelMapper.map(veterineriDto, Veterineri.class);
        return veterineri;
    }

    public VeterineriDto convertToDTO(Veterineri veterineri){
        VeterineriDto veterineriDto = modelMapper.map(veterineri, VeterineriDto.class);
        return veterineriDto;
    }

}
