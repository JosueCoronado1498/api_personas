package com.JosueCoronado.primer_crud.service;

import com.JosueCoronado.primer_crud.model.Mascota;
import com.JosueCoronado.primer_crud.model.Persona;

import java.util.List;

public interface IMascotaService {

    //metodo para traer mascotas
    public List<Mascota> getMascotas();

    //metodo para dar de alta una mascota
    public void saveMascota(Mascota masco);

    //metodo para borrar una mascota
    public void deleteMascota(Long id_mascota);

    //metodo para encontrar una mascota
    public Mascota findMascota(Long id_mascota);

    //metodo para modificar una mascota
    public void editMascota(Long idOriginal, Long id_mascotaNueva, String nuevoNombre, String nuevaEspecie, String nuevaRaza, String nuevoColor);

}
