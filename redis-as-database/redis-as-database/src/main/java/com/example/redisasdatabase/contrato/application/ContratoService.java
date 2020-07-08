package com.example.redisasdatabase.contrato.application;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

import com.example.redisasdatabase.contrato.domain.Contrato;
import com.example.redisasdatabase.contrato.domain.ContratoResponse;
import com.example.redisasdatabase.contrato.domain.Jornada;
import com.example.redisasdatabase.contrato.domain.Message;
import com.example.redisasdatabase.contrato.domain.Summary;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ContratoService {

	private final ContratoRepository repository;

    public ContratoResponse getByCpfCnpj(final String cpfCnpj, final String codigo, final Long jornadaNumero) {
        Optional<ContratoResponse> buscaNoRedis = this.getCodigo(codigo);
        if(buscaNoRedis.isPresent()) {
            return buscaNoRedis.get();
        }
        Optional<ContratoResponse> findByJornada = this.getJornadaNumero(jornadaNumero);
        if(findByJornada.isPresent()) {
            return findByJornada.get();
        }        
        final ContratoResponse response = ContratoResponse.getInstance();
        return this.repository.save(response);
	}

    private Optional<ContratoResponse> getJornadaNumero(Long jornadaNumero) {
        if(jornadaNumero == null) {
            return Optional.empty();
        }
        return repository.findByJornadaNumero(jornadaNumero);    }

    private Optional<ContratoResponse> getCodigo(String codigo) {
        if(StringUtils.isEmpty(codigo)) {
            return Optional.empty();
        }
        return repository.findById(codigo);
    }

}
