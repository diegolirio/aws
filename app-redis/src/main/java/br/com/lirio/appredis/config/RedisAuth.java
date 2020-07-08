package br.com.lirio.appredis.config;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

public class RedisAuth {

    @Getter
    @JsonProperty("redis_auth")
    private String redisAuth;

}