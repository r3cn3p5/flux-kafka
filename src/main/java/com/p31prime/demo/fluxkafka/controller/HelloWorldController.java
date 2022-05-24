package com.p31prime.demo.fluxkafka.controller;

import com.p31prime.demo.fluxkafka.model.HelloRequest;
import com.p31prime.demo.fluxkafka.model.HelloResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import reactor.core.publisher.Mono;

@Controller
public class HelloWorldController {

    @PostMapping("/sayhello")
    public Mono<HelloResponse> handleRequest(HelloRequest request) {

        // Place message on Kafka

        return Mono.just(new HelloResponse("The answer is 42"));
    }

}
