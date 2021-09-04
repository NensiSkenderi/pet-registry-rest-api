package com.pet.registry.dao.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "pronari")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Pronari {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "address")
    private String address;

    @Column(name = "city")
    private String city;

    @Column(name = "phone", unique = true)
    private String phone;

    @OneToMany(mappedBy = "pronari")
    private List<Kafshet> kafshet;
}

