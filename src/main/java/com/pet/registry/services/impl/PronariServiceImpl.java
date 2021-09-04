package com.pet.registry.services.impl;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.pet.registry.dao.dto.PronariDto;
import com.pet.registry.dao.mapper.PronariMapper;
import com.pet.registry.dao.mapper.VeterineriMapper;
import com.pet.registry.dao.model.Pronari;
import com.pet.registry.dao.repository.PronariRepository;
import com.pet.registry.services.PronariService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@JsonIgnoreProperties(ignoreUnknown = true)
public class PronariServiceImpl implements PronariService {

    @Autowired
    private PronariRepository pronariRepository;

    @Autowired
    private PronariMapper pronariMapper;

    @Override
    public PronariDto getOneOwner(int id) {

        Pronari pronari = pronariRepository.getById(id);
        PronariDto pronariDto = pronariMapper.convertToDTO(pronari);

        return pronariDto;
    }

    @Override
    public List<PronariDto> getAllOwners() {
        List<Pronari> pronariList = pronariRepository.findAll();
        List<PronariDto> pronariDtoList = new ArrayList<>();
        for(Pronari p : pronariList){
            pronariDtoList.add(pronariMapper.convertToDTO(p));
        }
        return pronariDtoList;
    }

    @Override
    public String createOwner(PronariDto pronariDto) {
        Pronari pronari = pronariMapper.convertToEntity(pronariDto);
        boolean pronariExists = pronariRepository.existsByPhone(pronariDto.getPhone());
        if (pronariExists)
            return "Pronari ekziston!";
        else{
            pronariRepository.save(pronari);
            return "Pronari u krijua!";
        }
    }

    @Override
    public void editOwner(int id, PronariDto pronariDto) {
        Pronari pronari = pronariRepository.findById(id).get();

        pronari.setName(pronariDto.getName());
        pronari.setSurname(pronariDto.getSurname());
        pronari.setAddress(pronariDto.getAddress());
        pronari.setCity(pronariDto.getCity());
        pronari.setPhone(pronariDto.getPhone());

        pronariRepository.save(pronari);
    }
}
