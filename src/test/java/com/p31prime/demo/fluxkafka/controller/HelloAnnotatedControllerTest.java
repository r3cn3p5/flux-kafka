package com.p31prime.demo.fluxkafka.controller;


import com.p31prime.demo.fluxkafka.model.HelloRequest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.reactive.server.WebTestClient;
import org.springframework.web.reactive.function.BodyInserters;
import reactor.core.publisher.Mono;

@WebFluxTest()
public class HelloAnnotatedControllerTest {

    @Autowired
    WebTestClient testClient;

    @Test
    public void sendHelloWorldMessage() {

        HelloRequest helloRequest = new HelloRequest("How are you?");

        testClient.post()
                    .uri("/api/sayhello")
                    .bodyValue(helloRequest)
                    .exchange()
                    .expectStatus().is2xxSuccessful();
    }




}
