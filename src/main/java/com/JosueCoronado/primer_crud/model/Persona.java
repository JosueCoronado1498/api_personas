package com.JosueCoronado.primer_crud.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String nombre;
    private String apellido;
    private int edad;

    @OneToOne
    @JoinColumn (name = "una_mascota_id_mascota", referencedColumnName = "id_mascota")
    private Mascota unaMascota;

    public Persona() {
    }

    public Persona(Long id, String nombre, String apellido, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

}
