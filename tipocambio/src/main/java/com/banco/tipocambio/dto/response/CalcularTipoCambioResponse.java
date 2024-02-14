package com.banco.tipocambio.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CalcularTipoCambioResponse {

    //La API debe devolver el “monto”, “monto con tipo de cambio”, “moneda origen”, “moneda destino“  y “tipo de cambio”.

    private String monto;
    private String montoConTipoCambio;
    private String divisaOrigen;
    private String divisaDestino;
    private String factorTipoCambio;
    private String token;
}
