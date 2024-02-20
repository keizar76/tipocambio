package com.banco.tipocambio.entities;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "_parametros")
public class Parametros {
@Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;
    @Basic
    private String nombre;
    private String data;
}
