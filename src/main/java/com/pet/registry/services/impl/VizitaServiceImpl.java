package com.pet.registry.services.impl;

import com.pet.registry.dao.dto.KafshetDto;
import com.pet.registry.dao.dto.VeterineriDto;
import com.pet.registry.dao.dto.VizitaDto;
import com.pet.registry.dao.mapper.VeterineriMapper;
import com.pet.registry.dao.mapper.VizitaMapper;
import com.pet.registry.dao.model.Kafshet;
import com.pet.registry.dao.model.Veterineri;
import com.pet.registry.dao.model.Vizita;
import com.pet.registry.dao.repository.KafshetRepository;
import com.pet.registry.dao.repository.VeterineriRepository;
import com.pet.registry.dao.repository.VizitaRepository;
import com.pet.registry.services.VizitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class VizitaServiceImpl implements VizitaService {

    @Autowired
    private VizitaMapper vizitaMapper;

    @Autowired
    private VizitaRepository vizitaRepository;

    @Autowired
    private VeterineriRepository veterineriRepository;

    @Autowired
    private KafshetRepository kafshetRepository;

    @Override
    public List<VizitaDto> getAllVisitsOfVet(int id) {
        Veterineri veterineri =  veterineriRepository.findById(id).get();
        List<Vizita> vizitaList = vizitaRepository.findAllByVeterineri(veterineri);
        List<VizitaDto> vizitaDtoList = new ArrayList<>();
        for(Vizita v : vizitaList) {
            vizitaDtoList.add(vizitaMapper.convertToDTO(v));
        }
        return vizitaDtoList;
    }

    @Override
    public void addVisitToVet(int id, int kafsha_id, int vizita_id, VizitaDto vizitaDto) {
        Veterineri veterineri = veterineriRepository.findById(id).get();
        Kafshet kafsha = kafshetRepository.findById(kafsha_id).get();
        Vizita vizita = new Vizita();
        vizita.setVeterineri(veterineri);
        vizita.setDate(LocalDate.parse(vizitaDto.getDate()));
        vizita.setDescription(vizitaDto.getDescription());
        vizita.setKafshet(kafsha);
        vizita.setVeterineri(veterineri);
        vizitaRepository.save(vizita);
    }
}
