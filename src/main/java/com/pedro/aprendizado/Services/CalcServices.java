package com.pedro.aprendizado.Services;

import java.util.ArrayList;
import java.util.List;

public class CalcServices {

  private class calcResolver {

    String equacao;
    List<String> tokens;

    public calcResolver(String equacao) {
      this.equacao = equacao;
      this.tokens = tokenizar(equacao);
    }

    private List<String> tokenizar(String equacao) {
      List<String> token = new ArrayList<>();
      int i = 0;

      while (i < equacao.length()) {
        char caracter = equacao.charAt(i);
        if (Character.isWhitespace(caracter)) {
          i++;
          continue;
        }
        if (Character.isDigit(caracter) || caracter == '.') {
          StringBuilder numero = new StringBuilder();

          while (i < equacao.length() &&
              (Character.isDigit(caracter) || caracter == '.')) {
            numero.append(equacao.charAt(i));
            i++;
          }
          token.add(numero.toString());
          continue;
        }
        if ("+-*/".indexOf(caracter) != -1) {
          token.add(String.valueOf(caracter));
        }

        i++;
      }

      return token;
    }

    private Boolean isDigit(String str) {
      return str.matches("-?\\d+");
    }

  }
}
