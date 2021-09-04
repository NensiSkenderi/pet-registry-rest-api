package com.pet.registry.controllers;

import com.pet.registry.dao.dto.KafshetDto;
import com.pet.registry.dao.dto.VeterineriDto;
import com.pet.registry.dao.dto.VizitaDto;
import com.pet.registry.services.VeterineriService;
import com.pet.registry.services.VizitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vizita")
public class VizitaController {

    @Autowired
    private VizitaService vizitaService;

    @GetMapping("/getAllVisitsOfVet/{id}")
    private List<VizitaDto> getAllVisitsOfVet(@PathVariable int id){
        return vizitaService.getAllVisitsOfVet(id);
    }

    @PostMapping("/addVisitToVet/{id}")
    private void addVisitToVet(@PathVariable int id, @RequestParam int kafsha_id,
                               @RequestParam int vizita_id, @RequestBody VizitaDto vizitaDto){
        vizitaService.addVisitToVet(id, kafsha_id, vizita_id, vizitaDto);
    }

}
