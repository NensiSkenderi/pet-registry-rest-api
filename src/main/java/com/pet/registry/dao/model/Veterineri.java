package com.pet.registry.dao.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "veterineri")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Veterineri {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "license_id", unique = true)
    private int licenseId;

    @OneToMany(mappedBy = "veterineri")
    private List<Vizita> vizita;

    @ManyToMany
    @JoinColumn(name="specialiteti_id")
    private List<Specialitete> specialitete;

}
