package com.pedro.aprendizado;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import tools.jackson.databind.JsonNode;
import tools.jackson.databind.ObjectMapper;

@RestController
public class HelloWorldController {

  @GetMapping(path = "/hello")
  public JsonNode helloWorld() {
    JsonNode saida = new ObjectMapper().readTree("{\"hello\": \"world\"}");

    return saida;
  }

  @GetMapping(path = "/calc")
  public calcRespons calc(
      @RequestParam int a,
      @RequestParam String op,
      @RequestParam int b) {
    int res = 0;
    switch (op) {
      case "+":
        res = a + b;
        break;
      case "-":
        res = a - b;
        break;

      case "*":
        res = a * b;
        break;
      case "/":
        res = a / b;
        break;
      default:
        res = 0;
        break;
    }

    return new calcRespons(res);
  }

  public record calcRespons(int res) {
  }
}
