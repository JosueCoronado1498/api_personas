package com.JosueCoronado.primer_crud.service;

import com.JosueCoronado.primer_crud.model.Mascota;
import com.JosueCoronado.primer_crud.model.Persona;
import com.JosueCoronado.primer_crud.repository.IMascotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MascotaService implements IMascotaService {

    @Autowired
    private IMascotaRepository mascoRepo;

    @Override
    public List<Mascota> getMascotas() {
        List<Mascota> listaMascotas = mascoRepo.findAll();
        return listaMascotas;
    }

    @Override
    public void saveMascota(Mascota masco) {
        mascoRepo.save(masco);
    }

    @Override
    public void deleteMascota(Long id_mascota) {
        mascoRepo.deleteById(id_mascota);
    }

    @Override
    public Mascota findMascota(Long id_mascota) {
        return mascoRepo.findById(id_mascota).orElse(null);
    }

    @Override
    public void editMascota(Long idOriginal, Long id_mascotaNueva, String nuevoNombre, String nuevaEspecie, String nuevaRaza, String nuevoColor) {
        //busco el objeto original
        Mascota masco = this.findMascota(idOriginal);

        //proceso de modificacion a nivel logico


    }
}
