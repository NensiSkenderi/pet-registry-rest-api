package com.pet.registry.dao.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "specialitete")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Specialitete {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @ManyToMany(mappedBy = "specialitete")
    private List<Veterineri> veterineri;
}
