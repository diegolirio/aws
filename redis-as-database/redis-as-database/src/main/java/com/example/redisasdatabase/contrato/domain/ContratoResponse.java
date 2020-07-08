package com.example.redisasdatabase.contrato.domain;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import lombok.Data;

@Data
@RedisHash("contratos")
public class ContratoResponse {

    @Id
    private String codigo;
    private List<Summary> summary;    
    private Message message;
    private Jornada jornada;
    private List<Contrato> contratos;

    public static ContratoResponse getInstance() {
        Map<String, Double> hashMap = new HashMap<>();
        hashMap.put("amount", 0.0D);

        List<Summary> summary =
             List.of(Summary.builder()
                            .field("valor")
                            .value(hashMap)
                            .build(),
                     Summary.builder()
                                .field("valor")
                                .value(hashMap)
                                .build());


        Contrato contrato = Contrato.builder()
                                    .codigo("95622")
                                    .idContrato("6526252")
                                    .valor(1520.99D)
                                    .build();

        final ContratoResponse response = new ContratoResponse();
        response.setCodigo(UUID.randomUUID().toString());
        response.setSummary(summary);
        response.setMessage(Message.builder().codigo("success").mesangem("OK").build());
        response.setJornada(new Jornada(555L, LocalDateTime.now()));
        response.setContratos(List.of(contrato));
        return response;
    }

    
}