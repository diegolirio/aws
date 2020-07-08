package br.com.lirio.appredis.contrato.application;

import java.util.Optional;

import br.com.lirio.appredis.contrato.domain.ContratoResponse;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ContratoRepository extends CrudRepository<ContratoResponse, String> {

    Optional<ContratoResponse> findByJornadaNumero(@Param("jornadaNumero") Long numero);

}
