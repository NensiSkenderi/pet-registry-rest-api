package com.pet.registry.dao.repository;

import com.pet.registry.dao.model.Kafshet;
import com.pet.registry.dao.model.Pronari;
import com.pet.registry.dao.model.Veterineri;
import com.pet.registry.dao.model.Vizita;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface VizitaRepository extends JpaRepository<Vizita, Integer> {
    @Query("SELECT v FROM Vizita v WHERE v.veterineri = :v")
    List<Vizita> findAllByVeterineri(@Param("v") Veterineri v);
}
