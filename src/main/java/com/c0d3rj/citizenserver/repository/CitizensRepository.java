package com.c0d3rj.citizenserver.repository;

import com.c0d3rj.citizenserver.model.Citizens;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CitizensRepository extends JpaRepository<Citizens, Integer> {
    Page<Citizens> findCitizensBySurnameContainsAndNameContainsAndDobContains(String surname, String name, String dob, Pageable page);
}