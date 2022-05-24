package com.p31prime.demo.fluxkafka.controller;


import com.p31prime.demo.fluxkafka.model.HelloRequest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.test.web.reactive.server.WebTestClient;

@WebFluxTest
public class HelloWorldController {

    @Autowired
    WebTestClient testClient;

    @Test
    public void sendHelloWorldMessage() {

        HelloRequest helloRequest = new HelloRequest("How are you?");

        testClient.put()
                .uri("/sayhello")
                .bodyValue(helloRequest)
                .exchange()
                .expectStatus().is2xxSuccessful();
    }
}
