package com.k4soft.api.fabrica;

import com.k4soft.api.entities.PersonaEntity;
import com.k4soft.api.model.Persona;
import org.springframework.stereotype.Component;

@Component
public class PersonaFabrica {

     public Persona entityToModel(PersonaEntity personaEntity){
         Persona persona = new Persona();
         if(personaEntity != null){
              persona = new Persona(personaEntity.getId(),persona.getNombre());
         }else {
             persona = new Persona();
         }
         return persona;
     }
}
