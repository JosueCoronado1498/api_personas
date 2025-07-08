package com.JosueCoronado.primer_crud.controller;

import com.JosueCoronado.primer_crud.model.Mascota;
import com.JosueCoronado.primer_crud.model.Persona;
import com.JosueCoronado.primer_crud.service.IMascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MascotaController {

    @Autowired
    private IMascotaService mascoServ;

    @PostMapping("/mascotas/crear")
    public String saveMascota(@RequestBody Mascota masco){
        mascoServ.saveMascota(masco);

        return "La mascota fue creada corrrectamente";
    }


}
