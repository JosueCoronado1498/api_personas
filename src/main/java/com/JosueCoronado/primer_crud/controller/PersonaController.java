package com.JosueCoronado.primer_crud.controller;

import com.JosueCoronado.primer_crud.model.Persona;
import com.JosueCoronado.primer_crud.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonaController {

    @Autowired
    private IPersonaService persoServ;

    @GetMapping("/personas/traer")
    public List<Persona> getPersona(){
        return persoServ.getPersonas();
    }

    @PostMapping("/personas/crear")
    public String savePersona(@RequestBody Persona perso){
        persoServ.savePersona(perso);

        return "La persona fue creada corrrectamente";
    }

    @DeleteMapping("/personas/eliminar/{id}")
    public String deletePersona(@PathVariable Long id){
        persoServ.deletePersona(id);

        return "La persona se elimino correctamente";
    }

    @PutMapping("/personas/editar/{id_original}")
    public Persona editPersona(@PathVariable Long id_original,
                               @RequestParam(required = false, name = "id") Long nuevaId,
                               @RequestParam(required = false, name = "nombre") String nuevoNombre,
                               @RequestParam(required = false, name = "apellido") String nuevoApellido,
                               @RequestParam(required = false, name = "edad") int nuevaEdad){
        persoServ.editPersona(id_original, nuevaId, nuevoNombre, nuevoApellido, nuevaEdad);
        Persona perso = persoServ.findPersona(nuevaId);

        return perso;

    }

    @PutMapping("/personas/editar")
    public Persona editPersona(@RequestBody Persona per){
        persoServ.editPersona(per);

        return persoServ.findPersona(per.getId());
    }




}
