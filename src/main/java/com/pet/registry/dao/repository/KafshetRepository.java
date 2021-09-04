package com.pet.registry.dao.repository;

import com.pet.registry.dao.model.Kafshet;
import com.pet.registry.dao.model.Pronari;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface KafshetRepository extends JpaRepository<Kafshet, Integer> {
    @Query("SELECT k FROM Kafshet k WHERE k.pronari = :p")
    List<Kafshet> findAllByPronari(@Param("p") Pronari p);
}
