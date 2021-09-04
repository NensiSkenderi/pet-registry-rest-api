package com.pet.registry.dao.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "kafshet")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Kafshet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "type")
    private String type;

    @OneToMany(mappedBy = "kafshet")
    private List<Vizita> vizita;

    @ManyToOne
    @JoinColumn(name="pronari_id")
    private Pronari pronari;

}
