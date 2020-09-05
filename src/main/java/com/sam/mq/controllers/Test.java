package com.sam.mq.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/test")
public class Test {

    @GetMapping()
    Flux<String> getAll() {
        return Flux.just("Its working mq");
    }
}
