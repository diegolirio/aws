package com.example.redisasdatabase.contrato.presentation;

import javax.websocket.server.PathParam;

import com.example.redisasdatabase.contrato.application.ContratoService;
import com.example.redisasdatabase.contrato.domain.ContratoResponse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/contratos")
public class ContratoController {
    
    private final ContratoService contratoService;

    @GetMapping("/{cpfCnpj}")
    public ContratoResponse getByCpfCnpj(@PathVariable String cpfCnpj,
                                         String codigo,
                                         Long jornada) {
        return this.contratoService.getByCpfCnpj(cpfCnpj, codigo, jornada);
    }

}