package com.banco.tipocambio.services.impl;

import com.banco.tipocambio.dto.request.CalcularTipoCambioRequest;
import com.banco.tipocambio.dto.response.CalcularTipoCambioResponse;
import com.banco.tipocambio.entities.Parametros;
import com.banco.tipocambio.entities.TipoCambio;
import com.banco.tipocambio.services.OperacionesServicio;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class OperacionesServicioImpl implements OperacionesServicio{
    private static final String DIVISA_BASE = "DIVISA_BASE";
    private final ParametrosServicioImpl parametrosServicio;
    private final TipoCambioServicioImpl tipoCambioServicio;
  
     @Override
    public CalcularTipoCambioResponse calcularMontoCambio(CalcularTipoCambioRequest requestCalcular){
        CalcularTipoCambioResponse responseCalcular = new CalcularTipoCambioResponse();   
        
    
        if(requestCalcular!=null){
            TipoCambio tipoCambio = tipoCambioServicio.getTipoCambioByDivisas(requestCalcular.getMonedaOrigen(),requestCalcular.getMonedaDestino());
            if (tipoCambio!=null) {
                responseCalcular.setDivisaDestino(tipoCambio.getMonedaDestino());
                responseCalcular.setDivisaOrigen(tipoCambio.getMonedaOrigen());
                responseCalcular.setFactorTipoCambio(Double.toString(tipoCambio.getFactorTipoCambio()));
                responseCalcular.setMonto(requestCalcular.getMonto());
                Parametros parametroBase = parametrosServicio.getParametroByNombre(DIVISA_BASE);
                if(parametroBase!=null){
                    if(responseCalcular.getDivisaOrigen().equals(parametroBase.getData())){
                        responseCalcular.setMontoConTipoCambio(Double.toString(Double.parseDouble(responseCalcular.getMonto())/tipoCambio.getFactorTipoCambio()));
                    }else{
                        responseCalcular.setMontoConTipoCambio(Double.toString(Double.parseDouble(responseCalcular.getMonto())*tipoCambio.getFactorTipoCambio()));
                    }
                }                                
                return responseCalcular;    
            }            
        }
        return responseCalcular;
    }


}
