package com.pet.registry.dao.repository;

import com.pet.registry.dao.model.Pronari;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PronariRepository extends JpaRepository<Pronari, Integer> {

    boolean existsByPhone(String phone);
}
