/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aguirregermanportfolio.PortfolioGerman.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author German
 */

@Getter @Setter
@Entity
public class Persona implements Serializable {
     
    @Id
    @GeneratedValue (strategy=GenerationType.AUTO)
    private Long id;
    
    private String nombre;
    private String apellido;
    private String ocupacion;
    private String telefono;
    private String email;
    private String urlImagen;
    private int edad;

    public Persona() {
    }

    public Persona(Long id, String nombre, String apellido, String ocupacion, String telefono, String email, String urlImagen, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.ocupacion = ocupacion;
        this.telefono = telefono;
        this.email = email;
        this.urlImagen = urlImagen;
        this.edad = edad;
    }


   
    
    
}