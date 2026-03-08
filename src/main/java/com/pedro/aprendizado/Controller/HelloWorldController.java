package com.pedro.aprendizado.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pedro.aprendizado.Services.CalcServices;

import tools.jackson.databind.JsonNode;
import tools.jackson.databind.ObjectMapper;

@RestController
public class HelloWorldController {

  @GetMapping(path = "/hello")
  public JsonNode helloWorld() {
    JsonNode saida = new ObjectMapper().readTree("{\"hello\": \"world\"}");

    return saida;
  }

  @PostMapping(path = "/calc")
  public String calc(
      @RequestBody calcEntrada eqc) {
    return String.valueOf(CalcServices.resolve(eqc.eqc));
  }

  public record calcEntrada(String eqc) {
  }
}
