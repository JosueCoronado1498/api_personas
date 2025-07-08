package com.JosueCoronado.primer_crud.repository;

import com.JosueCoronado.primer_crud.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository <Persona, Long> {
}
