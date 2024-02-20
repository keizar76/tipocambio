package com.banco.tipocambio.controllers;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import com.banco.tipocambio.dto.request.CalcularTipoCambioRequest;
import com.banco.tipocambio.dto.response.CalcularTipoCambioResponse;
import com.banco.tipocambio.services.impl.OperacionesServicioImpl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/v1/operaciones")
@RequiredArgsConstructor
@CrossOrigin(origins = {"http://localhost:4200/"})
public class OperacionesController {
    private final OperacionesServicioImpl operacionesServicio;
    @PostMapping("calcularTipoCambio")
    public CalcularTipoCambioResponse calcularTipoCambio(@RequestBody CalcularTipoCambioRequest requestCalcular) {
        CalcularTipoCambioResponse responseCalcular = new CalcularTipoCambioResponse();
        if (requestCalcular!=null){
            responseCalcular = operacionesServicio.calcularMontoCambio(requestCalcular);
        }
        
        return responseCalcular;
    }
}
