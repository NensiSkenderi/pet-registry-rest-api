package com.pet.registry.services;

import com.pet.registry.dao.dto.KafshetDto;
import com.pet.registry.dao.dto.VizitaDto;

import java.util.List;

public interface VizitaService {

    public List<VizitaDto> getAllVisitsOfVet(int id);
    public void addVisitToVet(int id, int kafsha_id, int vizita_id, VizitaDto vizitaDto);
}
