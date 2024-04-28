package br.gov.sp.etec.kmelo.iot.application.web.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestApi {

    @GetMapping
    private String getMapping() {
        return "Hello, world";
    }
}
