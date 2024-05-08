package com.udemy.course.app.gateway.filters;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

@Component
public class EjemploGlobalFilter implements GlobalFilter {

    private final Logger logger = LoggerFactory.getLogger(EjemploGlobalFilter.class);

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        logger.info("Ejecutando filtro pre");
        return chain.filter(exchange).then(Mono.fromRunnable( () -> {

        } ));
    }
}
