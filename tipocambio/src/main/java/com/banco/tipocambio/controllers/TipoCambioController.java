package com.banco.tipocambio.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.banco.tipocambio.dto.request.CalcularTipoCambioRequest;
import com.banco.tipocambio.dto.response.CalcularTipoCambioResponse;
import com.banco.tipocambio.entities.TipoCambio;
import com.banco.tipocambio.services.AuthenticationService;
import com.banco.tipocambio.services.impl.TipoCambioServicioImpl;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/api/v1/tipocambio")
@RequiredArgsConstructor
public class TipoCambioController {
    private final TipoCambioServicioImpl tipoCambioServicio;
    private final AuthenticationService authenticationService;
    
    @PostMapping("calcularTipoCambio")
    public CalcularTipoCambioResponse calcularTipoCambio(@RequestBody CalcularTipoCambioRequest requestCalcular) {
        CalcularTipoCambioResponse responseCalcular = new CalcularTipoCambioResponse();
        if (requestCalcular!=null){
            responseCalcular = tipoCambioServicio.calcularMontoCambio(requestCalcular);
        }
        
        return responseCalcular;
    }
    
    @PostMapping("createTipoCambio")
    public void createTipoCambio(@RequestBody TipoCambio tipoCambio) {
        tipoCambioServicio.createTipoCambio(null);
    }
    
    @GetMapping("getTipoCambioAll")
    public List<TipoCambio> getTipoCambioAll() {
        
        return tipoCambioServicio.getTipoCambioAll();
    }
}
