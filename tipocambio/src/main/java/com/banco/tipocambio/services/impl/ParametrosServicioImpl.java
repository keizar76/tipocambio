package com.banco.tipocambio.services.impl;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import com.banco.tipocambio.entities.Parametros;
import com.banco.tipocambio.repositories.ParametrosRepositorio;
import com.banco.tipocambio.services.ParametrosServicio;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ParametrosServicioImpl implements ParametrosServicio{
    private final ParametrosRepositorio parametrosRepo;
    
    @Override
    public void createParametro(Parametros parametro) {
        if(parametro!=null){
            parametrosRepo.save(parametro);
        }
    }

    @Override
    public Parametros getParametroById(Integer id) {
         Optional<Parametros> optionalParametros;
        if(id!=null){
            optionalParametros = parametrosRepo.findById(id);
            return optionalParametros.isPresent()?optionalParametros.get():null;
        }        
        return null;
    }

    @Override
    public Parametros getParametroByNombre(String nombreParametro) {
        List<Parametros> listParametros = parametrosRepo.findAll();
        if (nombreParametro!=null){
            for (Parametros parametros : listParametros) {
                if (parametros.getNombre().equals(nombreParametro)) {
                    return parametros;                
                }
                
            }
        }
        return null;
    }

    @Override
    public List<Parametros> getParametrosAll() {
        return parametrosRepo.findAll();
    }

    @Override
    public void deleteParametroById(Integer id) {
        if(id!=null){
            parametrosRepo.deleteById(id);
        }
    }

}
