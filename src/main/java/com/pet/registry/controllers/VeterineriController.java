package com.pet.registry.controllers;

import com.pet.registry.dao.dto.VeterineriDto;
import com.pet.registry.services.VeterineriService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/veterineri")
public class VeterineriController {

    @Autowired
    private VeterineriService veterineriService;

    @GetMapping("/getAllVet")
    private List<VeterineriDto> getAllVet(){
        return veterineriService.getAllVet();
    }

    @PostMapping("/createVet")
    private String createVet(@RequestBody VeterineriDto veterineriDto){
        return veterineriService.createVet(veterineriDto);
    }


}
