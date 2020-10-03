package com.k4soft.api.model;


public class Persona {

    private Integer idPersona;
    private String nombre;


    public Persona(Integer idPersona, String nombre) {
        this.idPersona = idPersona;
        this.nombre = nombre;
    }

    public Persona() {
        super();
    }

    public Integer getIdPersona() {
        return idPersona;
    }

    public String getNombre() {
        return nombre;
    }
}
