package com.banco.tipocambio.services.impl;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import com.banco.tipocambio.entities.TipoCambio;
import com.banco.tipocambio.repositories.TipoCambioRepositorio;
import com.banco.tipocambio.services.TipoCambioServicio;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TipoCambioServicioImpl implements TipoCambioServicio {
    private final TipoCambioRepositorio tipoCambioRepo;

    @Override
    public void createTipoCambio(TipoCambio tipoCambio)
    {
        if(tipoCambio!=null){
            tipoCambioRepo.save(tipoCambio);
        }
    }

    @Override
    public TipoCambio getTipoCambioById(Integer id){
        Optional<TipoCambio> optionalTipoCambio;
        if(id!=null){
            optionalTipoCambio = tipoCambioRepo.findById(id);
            return optionalTipoCambio.isPresent()?optionalTipoCambio.get():null;
        }        
        return null;
    }
    
    @Override
    public TipoCambio getTipoCambioByDivisas(String divisaOrigen, String divisaDestino) {
        List<TipoCambio> listTipoCambio = tipoCambioRepo.findAll();
        for (TipoCambio tipoCambio : listTipoCambio) {
            if (tipoCambio.getMonedaOrigen().equals(divisaOrigen)&&tipoCambio.getMonedaDestino().equals(divisaDestino)) {
                return tipoCambio;                
            }            
        }
        return null;
    }

    @Override
    public TipoCambio getTipoCambioByDivisaOrigen(String divisa){
        List<TipoCambio> listTipoCambio = tipoCambioRepo.findAll();
        if(divisa!=null){
            for (TipoCambio tipoCambio : listTipoCambio) {
                if (tipoCambio.getMonedaOrigen().equals(divisa)) {
                    return tipoCambio;                
                }
                
            }
        }

        return null;
    }

    @Override
    public double getFactorTipoCambioByDivisa(String divisa){
        TipoCambio tipoCambio;
        tipoCambio=getTipoCambioByDivisaOrigen(divisa);
        return tipoCambio!=null?tipoCambio.getFactorTipoCambio():0;                
    }

    @Override
    public List<TipoCambio> getTipoCambioAll(){
        return tipoCambioRepo.findAll();
    }

    @Override
    public void deleteTipoCambioById(Integer id){
        if(id!=null){
            tipoCambioRepo.deleteById(id);
        }        
    }
}
