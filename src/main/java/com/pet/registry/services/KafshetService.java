package com.pet.registry.services;

import com.pet.registry.dao.dto.KafshetDto;
import com.pet.registry.dao.dto.PronariDto;

import java.util.List;

public interface KafshetService {
    public List<KafshetDto> getAllOwnerPets();
    public PronariDto getOneOwnerPets(int id);
    public void addPetToOwner(int id, KafshetDto kafshetDto);
}
