/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aguirregermanportfolio.PortfolioGerman.controller;


import com.aguirregermanportfolio.PortfolioGerman.model.Portada;
import com.aguirregermanportfolio.PortfolioGerman.service.IPortadaService;
import com.aguirregermanportfolio.PortfolioGerman.service.PortadaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author German
 */
@RestController
@RequestMapping ("/portada")
@CrossOrigin
public class PortadaController {
    
    @Autowired
    private PortadaService portService;
    
    @Autowired
    private IPortadaService interPortada;
    
    @GetMapping ("/traer")
    @ResponseBody
    public List<Portada> getPortada(){
        return interPortada.getPortada();
    }
    
    @PostMapping ("crear")
    public String crearPortada(@RequestBody Portada port){
        interPortada.savePortada(port);
        return "La Portada fue creada correctamente";
    }
    
    @DeleteMapping ("/delete/{id}")
    public ResponseEntity<?> deleteAcercaDeMi (@PathVariable("id") Long id){        
        portService.deletePortada(id);
        return new ResponseEntity<>(HttpStatus.OK); 
    }
    
    @PutMapping("/update/{id}")
    public ResponseEntity<Portada> updatePortada(@PathVariable Long id, @RequestBody Portada port) {
        Portada updatePort = portService.updatePortada(port);
        return new ResponseEntity<>(updatePort, HttpStatus.CREATED);
    }
   
}