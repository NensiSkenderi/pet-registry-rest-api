package com.pet.registry.services;


import com.pet.registry.dao.dto.PronariDto;

import java.util.List;


public interface PronariService {

    public PronariDto getOneOwner(int id);
    public List<PronariDto> getAllOwners();
    public String createOwner(PronariDto pronariDto);
    public void editOwner(int id, PronariDto pronariDto);
}
