package com.example.redisasdatabase.contrato.application;

import java.util.Optional;

import com.example.redisasdatabase.contrato.domain.ContratoResponse;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ContratoRepository extends CrudRepository<ContratoResponse, String> {

    Optional<ContratoResponse> findByJornadaNumero(@Param("jornadaNumero") Long numero);

}
