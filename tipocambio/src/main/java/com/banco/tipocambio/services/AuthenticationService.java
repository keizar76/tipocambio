package com.banco.tipocambio.services;

import com.banco.tipocambio.dto.request.SignUpRequest;
import com.banco.tipocambio.dto.request.SigninRequest;
import com.banco.tipocambio.dto.response.JwtAuthenticationResponse;

public interface AuthenticationService {
    JwtAuthenticationResponse signup(SignUpRequest request);

    JwtAuthenticationResponse signin(SigninRequest request);
}
