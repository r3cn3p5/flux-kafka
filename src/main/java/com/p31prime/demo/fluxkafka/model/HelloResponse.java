package com.p31prime.demo.fluxkafka.model;

import lombok.Data;
import lombok.NonNull;

@Data
public class HelloResponse {

    @NonNull
    private String answer;
}
