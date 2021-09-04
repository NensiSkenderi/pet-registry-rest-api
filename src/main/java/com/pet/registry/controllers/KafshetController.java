package com.pet.registry.controllers;

import com.fasterxml.jackson.annotation.JsonView;;
import com.pet.registry.dao.dto.KafshetDto;
import com.pet.registry.dao.dto.PronariDto;
import com.pet.registry.dao.model.View;
import com.pet.registry.services.KafshetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/kafshet")
public class KafshetController {

    @Autowired
    private KafshetService kafshetService;

    @JsonView(View.ViewOnlyPet.class)
    @GetMapping("/getAllOwnerPets")
    private List<KafshetDto> getAllOwnerPets(){
        return kafshetService.getAllOwnerPets();
    }

    @JsonView(View.ViewOnlyPet.class)
    @GetMapping("/getOneOwnerPets/{id}")
    private PronariDto getOneOwnerPets(@PathVariable int id){
        return kafshetService.getOneOwnerPets(id);
    }

    @PostMapping("/addPetToOwner/{id}")
    private void addPetToOwner(@PathVariable int id, @RequestBody KafshetDto kafshetDto){
       kafshetService.addPetToOwner(id, kafshetDto);
    }

}
