package com.banco.tipocambio.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


import com.banco.tipocambio.entities.Parametros;
import com.banco.tipocambio.services.impl.ParametrosServicioImpl;

@RestController
@RequestMapping("/api/v1/parametros")
@RequiredArgsConstructor
@CrossOrigin(origins = {"http://localhost:4200/"})
public class ParametrosController {

    private final ParametrosServicioImpl parametrosServicio;
    
    @PostMapping("createParametro")
    public void createParametro(@RequestBody Parametros parametro) {
        parametrosServicio.createParametro(parametro);
    }
    
    @GetMapping("getParametrosAll")
    public List<Parametros> getParametrosAll() {
        
        return parametrosServicio.getParametrosAll();
    }

}
