package com.banco.tipocambio.dto.request;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CalcularTipoCambioRequest {
    private String monto;
    private String divisaOrigen;
    private String divisaDestino;
    private String email;
    private String password;
}
