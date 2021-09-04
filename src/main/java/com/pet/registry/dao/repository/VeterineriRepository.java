package com.pet.registry.dao.repository;

import com.pet.registry.dao.model.Kafshet;
import com.pet.registry.dao.model.Pronari;
import com.pet.registry.dao.model.Veterineri;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VeterineriRepository extends JpaRepository<Veterineri, Integer> {

    boolean existsByLicenseId(int licenseId);

}
