package com.banco.tipocambio.services;

import java.util.List;
import com.banco.tipocambio.entities.Parametros;

public interface ParametrosServicio {
    void createParametro(Parametros parametro);

    Parametros getParametroById(Integer id);

    Parametros getParametroByNombre(String nombreParametro);

    List<Parametros> getParametrosAll();

    void deleteParametroById(Integer id);
}
