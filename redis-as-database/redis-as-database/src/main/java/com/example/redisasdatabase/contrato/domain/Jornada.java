package com.example.redisasdatabase.contrato.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Jornada {

    private Long numero;
    private LocalDateTime data; 


}
