package com.pet.registry.services;

import com.pet.registry.dao.dto.VeterineriDto;
import com.pet.registry.dao.model.Veterineri;

import java.util.List;

public interface VeterineriService {

    public List<VeterineriDto> getAllVet();
    public String createVet(VeterineriDto veterineriDto);
}
