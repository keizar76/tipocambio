package com.banco.tipocambio.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.banco.tipocambio.entities.TipoCambio;
import com.banco.tipocambio.services.impl.TipoCambioServicioImpl;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/api/v1/tipocambio")
@RequiredArgsConstructor
@CrossOrigin(origins = {"http://localhost:4200/"})
public class TipoCambioController {
    private final TipoCambioServicioImpl tipoCambioServicio;
    
    @PostMapping("createTipoCambio")
    public void createTipoCambio(@RequestBody TipoCambio tipoCambio) {
        tipoCambioServicio.createTipoCambio(tipoCambio);
    }
    
    @GetMapping("getTipoCambioAll")
    public List<TipoCambio> getTipoCambioAll() {
        
        return tipoCambioServicio.getTipoCambioAll();
    }
}
