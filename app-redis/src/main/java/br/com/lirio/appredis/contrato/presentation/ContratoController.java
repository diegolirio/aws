package br.com.lirio.appredis.contrato.presentation;

import br.com.lirio.appredis.contrato.application.ContratoService;
import br.com.lirio.appredis.contrato.domain.ContratoResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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