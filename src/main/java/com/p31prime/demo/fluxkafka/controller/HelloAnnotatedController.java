package com.p31prime.demo.fluxkafka.controller;

import com.p31prime.demo.fluxkafka.model.HelloRequest;
import com.p31prime.demo.fluxkafka.model.HelloResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.config.EnableWebFlux;
import reactor.core.publisher.Mono;

@EnableWebFlux
@RestController
public class HelloAnnotatedController {

    @PostMapping(value = "/api/sayhello", consumes = "application/json", produces = "application/json")
    public Mono<HelloResponse> handleRequest(@RequestBody Mono<HelloRequest> request) {

        // Place message on Kafka
        return Mono.just(new HelloResponse("The answer is 42"));

    }



}
