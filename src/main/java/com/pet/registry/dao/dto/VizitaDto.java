package com.pet.registry.dao.dto;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

@Data
public class VizitaDto {

    private String date;
    private String description;
    @JsonBackReference(value="kafshet-vizita")
    private KafshetDto kafshet;
}
