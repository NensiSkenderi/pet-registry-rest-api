package com.pet.registry.dao.dto;

import lombok.Data;

import java.util.List;

@Data
public class VeterineriDto {

    private String name;
    private String surname;
    private int licenseId;
    private List<SpecialiteteDto> specialitete;

}
