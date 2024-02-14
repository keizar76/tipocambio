package com.banco.tipocambio.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CalcularTipoCambioResponse {

    //La API debe devolver el “monto”, “monto con tipo de cambio”, “moneda origen”, “moneda destino“  y “tipo de cambio”.

    private String monto;
    private String montoConTipoCambio;
    private String divisaOrigen;
    private String divisaDestino;
    private String factorTipoCambio;
}
