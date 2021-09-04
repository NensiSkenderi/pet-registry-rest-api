package com.pet.registry.dao.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "vizita")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Vizita {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "date")
    private LocalDate date;

    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name="veterineri_id")
    private Veterineri veterineri;

    @ManyToOne
    @JoinColumn(name="kafsha_id")
    private Kafshet kafshet;
}
