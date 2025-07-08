package com.JosueCoronado.primer_crud.service;

import com.JosueCoronado.primer_crud.model.Persona;

import java.util.List;

public interface IPersonaService {

    //metodo para traer personas
    public List<Persona> getPersonas();

    //metodo para dar de alta una persona
    public void savePersona(Persona perso);

    //metodo para borrar una persona
    public void deletePersona(Long id);

    //metodo para encontrar una persona
    public Persona findPersona(Long id);

    //metodo para modificar una persona
    public void editPersona(Long idOriginal, Long idNueva, String nuevoNombre, String nuevoApellido, int nuevaEdad);

    void editPersona(Persona per);
}
