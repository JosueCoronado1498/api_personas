package com.JosueCoronado.primer_crud.repository;

import com.JosueCoronado.primer_crud.model.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMascotaRepository extends JpaRepository <Mascota, Long> {
}
