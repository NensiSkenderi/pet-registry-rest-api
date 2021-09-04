package com.pet.registry.dao.dto;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonView;
import com.pet.registry.dao.model.View;
import lombok.Data;

import java.util.List;

@Data
public class PronariDto {

    @JsonView({View.ViewOnlyOwner.class, View.ViewOnlyPet.class})
    private int id;

    @JsonView({View.ViewOnlyOwner.class, View.ViewOnlyPet.class})
    private String name;

    @JsonView({View.ViewOnlyOwner.class, View.ViewOnlyPet.class})
    private String surname;

    @JsonView({View.ViewOnlyOwner.class, View.ViewOnlyPet.class})
    private String address;

    @JsonView({View.ViewOnlyOwner.class, View.ViewOnlyPet.class})
    private String city;

    @JsonView({View.ViewOnlyOwner.class, View.ViewOnlyPet.class})
    private String phone;

    @JsonView(View.ViewOnlyPet.class)
    @JsonManagedReference(value="kafshet-pronari")
    private List<KafshetDto> kafshet;

}
