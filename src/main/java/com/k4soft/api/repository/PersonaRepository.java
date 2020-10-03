package com.k4soft.api.repository;

import com.k4soft.api.entities.PersonaEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends CrudRepository< PersonaEntity,Integer> {
}
