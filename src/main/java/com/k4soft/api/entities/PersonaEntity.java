package com.k4soft.api.entities;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "persona")
public class PersonaEntity{


    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "nombre")
    private String nombre;


}
