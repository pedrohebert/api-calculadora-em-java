package com.pedro.aprendizado.Services.calc;

import java.util.List;

import com.pedro.aprendizado.Services.calc.aux.CalcParser;
import com.pedro.aprendizado.Services.calc.aux.calcTokenizer;
import com.pedro.aprendizado.model.aux.Node;

public class calcResolve {

  String equacao;

  public calcResolve(String equacao) {
    this.equacao = equacao;

  }

  public static double resolve(String equacao) {
    List<String> tokens = calcTokenizer.tokenizar(equacao);
    Node calc = CalcParser.Parse(tokens);
    // tokens.forEach(System.out::println);
    return calc.get_valor();
  }
}
