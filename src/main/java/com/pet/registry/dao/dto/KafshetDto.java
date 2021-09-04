package com.pet.registry.dao.dto;

import com.fasterxml.jackson.annotation.*;
import com.pet.registry.dao.model.View;
import lombok.Data;

import java.util.List;

@Data
public class KafshetDto {

    @JsonView(View.ViewOnlyPet.class)
    private String id;

    @JsonView(View.ViewOnlyPet.class)
    private String name;

    @JsonView(View.ViewOnlyPet.class)
    private String type;

    @JsonManagedReference(value="kafshet-vizita")
    private List<VizitaDto> vizita;

    @JsonBackReference(value="kafshet-pronari")
    private PronariDto pronari;

}
