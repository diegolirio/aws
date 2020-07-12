package br.com.lirio.appredis.policy.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@Getter
@Setter
@RedisHash("roles")
public class Role {

    @Id
    private Long id;
    private Long fluxNumer;
}
