package br.com.lirio.appredis.policy.presentation;

import br.com.lirio.appredis.policy.application.RoleService;
import br.com.lirio.appredis.policy.domain.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/roles")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @GetMapping("/flux-number/{fluxNumber}")
    public Role generate(@PathVariable Long fluxNumber) {
        return this.roleService.generate(fluxNumber);
    }
}
