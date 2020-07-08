package com.example.redisasdatabase.contrato.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Contrato {

    private String idContrato;
    private String codigo;
    private Double valor;

}
