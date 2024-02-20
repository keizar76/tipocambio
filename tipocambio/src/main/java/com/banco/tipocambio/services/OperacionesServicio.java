package com.banco.tipocambio.services;

import com.banco.tipocambio.dto.request.CalcularTipoCambioRequest;
import com.banco.tipocambio.dto.response.CalcularTipoCambioResponse;

public interface OperacionesServicio {
    CalcularTipoCambioResponse calcularMontoCambio(CalcularTipoCambioRequest requestCalcular);
}
