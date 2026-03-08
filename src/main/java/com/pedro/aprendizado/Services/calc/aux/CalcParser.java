package com.pedro.aprendizado.Services.calc.aux;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import com.pedro.aprendizado.model.aux.Node;
import com.pedro.aprendizado.model.aux.NodeOpBin;
import com.pedro.aprendizado.model.aux.NodeValor;

public class CalcParser {

  public static Node Parse(List<String> tokens) {
    tokens = posFixa(tokens);
    Stack<Node> pilha = new Stack<>();

    for (String token : tokens) {
      if (Enumero(token)) {
        pilha.push(new NodeValor(Double.parseDouble(token)));
      }
      if ("+-*/".indexOf(token) != -1) {
        NodeOpBin op = new NodeOpBin(token);
        op.SetDir(pilha.pop());
        op.SetEsq(pilha.pop());
        pilha.push(op);
      }
    }

    return pilha.pop();
  }

  private static List<String> posFixa(List<String> tokens) {
    List<String> saida = new ArrayList<>();
    Stack<String> pilha = new Stack<>();

    for (String token : tokens) {
      if (Enumero(token) || token == "(") {
        saida.add(token);
      }
      if ("+-*/(".indexOf(token) != -1) {
        if (!pilha.isEmpty() && Procedencia(pilha.peek()) >= Procedencia(token)) {
          while (!pilha.empty() && !pilha.peek().equals("(") && Procedencia(pilha.peek()) >= Procedencia(token)) {
            saida.add(pilha.pop());
          }
        }
        pilha.push(token);

      }
      if (token.equals(")")) {
        while (!pilha.isEmpty() && !pilha.peek().equals("(")) {
          saida.add(pilha.pop());
        }
        pilha.pop();
      }

      /*
       * System.out.println("token: " + token);
       * System.out.println("saida: " + saida);
       * System.out.println("pilha: " + pilha);
       */
    }

    while (!pilha.isEmpty()) {
      saida.add(pilha.pop());
    }

    return saida;
  }

  private static int Procedencia(String op) {
    switch (op) {
      case "+":
      case "-":
        return 1;
      case "*":
      case "/":
        return 2;
      case "(":
      case ")":
        return 3;

      default:
        return 0;
    }
  }

  private static Boolean Enumero(String num) {
    try {
      Double.parseDouble(num);
      return true;
    } catch (NumberFormatException e) {
      return false;
    }
  }
}
/*
 * 1 + 2 * 3
 * g=+ *
 * s=1 2 3
 *
 */
