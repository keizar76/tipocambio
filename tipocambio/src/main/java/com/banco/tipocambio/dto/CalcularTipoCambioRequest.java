package com.banco.tipocambio.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CalcularTipoCambioRequest {
    private String monto;
    private String divisaOrigen;
    private String divisaDestino;

}
