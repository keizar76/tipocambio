package com.banco.tipocambio.services;

import java.util.List;

import com.banco.tipocambio.dto.request.CalcularTipoCambioRequest;
import com.banco.tipocambio.dto.response.CalcularTipoCambioResponse;
import com.banco.tipocambio.entities.TipoCambio;

public interface TipoCambioServicio {

    void createTipoCambio(TipoCambio tipoCambio);

    TipoCambio getTipoCambioById(Integer id);

    CalcularTipoCambioResponse calcularMontoCambio(CalcularTipoCambioRequest requestCalcular);

    TipoCambio getTipoCambioByDivisaOrigen(String divisa);

    double getFactorTipoCambioByDivisa(String divisa);

    List<TipoCambio> getTipoCambioAll();

    void deleteTipoCambioById(Integer id);

}