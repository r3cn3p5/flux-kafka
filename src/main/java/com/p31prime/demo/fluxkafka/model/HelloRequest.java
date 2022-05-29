package com.p31prime.demo.fluxkafka.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
public class HelloRequest {

    @NonNull
    private String question;

}
