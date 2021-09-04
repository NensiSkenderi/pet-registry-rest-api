package com.pet.registry.controllers;

import com.fasterxml.jackson.annotation.JsonView;
import com.pet.registry.dao.dto.PronariDto;
import com.pet.registry.dao.model.View;
import com.pet.registry.services.PronariService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pronari")
public class PronariController {

    @Autowired
    private PronariService pronariService;

    @JsonView(View.ViewOnlyOwner.class)
    @GetMapping("/getById/{id}")
    private PronariDto getOneOwner(@PathVariable int id){
        return pronariService.getOneOwner(id);
    }

    @JsonView(View.ViewOnlyOwner.class)
    @GetMapping("/getAllOwners")
    private List<PronariDto> getAllOwners(){
        return pronariService.getAllOwners();
    }

    @PostMapping("/createOwner")
    private String createOwner(@RequestBody PronariDto pronariDto){
        return pronariService.createOwner(pronariDto);
    }

    @PutMapping("/editOwner/{id}")
    private void editOwner(@PathVariable int id, @RequestBody PronariDto pronariDto){
        pronariService.editOwner(id, pronariDto);
    }

}
