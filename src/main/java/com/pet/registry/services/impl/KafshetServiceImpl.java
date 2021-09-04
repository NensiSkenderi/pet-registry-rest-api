package com.pet.registry.services.impl;

import com.pet.registry.dao.dto.KafshetDto;
import com.pet.registry.dao.dto.PronariDto;
import com.pet.registry.dao.mapper.KafshetMapper;
import com.pet.registry.dao.mapper.PronariMapper;
import com.pet.registry.dao.model.Kafshet;
import com.pet.registry.dao.model.Pronari;
import com.pet.registry.dao.repository.KafshetRepository;
import com.pet.registry.dao.repository.PronariRepository;
import com.pet.registry.services.KafshetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class KafshetServiceImpl implements KafshetService {

    @Autowired
    private KafshetRepository kafshetRepository;

    @Autowired
    private PronariRepository pronariRepository;

    @Autowired
    private KafshetMapper kafshetMapper;

    @Autowired
    private PronariMapper pronariMapper;

    @Override
    public List<KafshetDto> getAllOwnerPets() {
        List<Kafshet> kafshet = kafshetRepository.findAll();
        List<KafshetDto> kafshetDtoList = new ArrayList<>();
        for(Kafshet k : kafshet){
            kafshetDtoList.add(kafshetMapper.convertToDTO(k));
        }
        return kafshetDtoList;
    }

    @Override
    public PronariDto getOneOwnerPets(int id) {
        Pronari pronari = pronariRepository.findById(id).get();
        return pronariMapper.convertToDTO(pronari);
    }

    @Override
    public void addPetToOwner(int id, KafshetDto kafshetDto) {
        Pronari pronari = pronariRepository.getById(id);
        Kafshet kafshet = new Kafshet();
        kafshet.setPronari(pronari);
        kafshet.setName(kafshetDto.getName());
        kafshet.setType(kafshetDto.getType());
        kafshetRepository.save(kafshet);
    }

}
