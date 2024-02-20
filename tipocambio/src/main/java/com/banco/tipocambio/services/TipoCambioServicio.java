package com.banco.tipocambio.services;

import java.util.List;
import com.banco.tipocambio.entities.TipoCambio;

public interface TipoCambioServicio {

    void createTipoCambio(TipoCambio tipoCambio);

    TipoCambio getTipoCambioById(Integer id);

    TipoCambio getTipoCambioByDivisaOrigen(String divisa);

    double getFactorTipoCambioByDivisa(String divisa);
    
    TipoCambio getTipoCambioByDivisas(String divisaOrigen, String divisaDestino);

    List<TipoCambio> getTipoCambioAll();

    void deleteTipoCambioById(Integer id);

}