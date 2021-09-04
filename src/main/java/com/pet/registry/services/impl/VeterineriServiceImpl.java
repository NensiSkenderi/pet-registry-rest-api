package com.pet.registry.services.impl;

import com.pet.registry.dao.dto.VeterineriDto;
import com.pet.registry.dao.mapper.VeterineriMapper;
import com.pet.registry.dao.model.Veterineri;
import com.pet.registry.dao.repository.VeterineriRepository;
import com.pet.registry.services.VeterineriService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VeterineriServiceImpl implements VeterineriService {

    @Autowired
    private VeterineriRepository veterineriRepository;

    @Autowired
    private VeterineriMapper veterineriMapper;

    @Override
    public List<VeterineriDto> getAllVet() {
        List<Veterineri> veterineriList = veterineriRepository.findAll();
        List<VeterineriDto> veterineriDtoList = new ArrayList<>();
            for (Veterineri veterineri : veterineriList) {
                veterineriDtoList.add(veterineriMapper.convertToDTO(veterineri));
            }
        return veterineriDtoList;
    }

    @Override
    public String createVet(VeterineriDto veterineriDto) {
        Veterineri veterineri = veterineriMapper.convertToEntity(veterineriDto);
        boolean veterineriExists = veterineriRepository.existsByLicenseId(veterineriDto.getLicenseId());
        if(veterineriExists)
            return "Veterineri ekziston!";
        else {
            veterineriRepository.save(veterineri);
            return "Veterineri u krijua!";
        }
    }
}
