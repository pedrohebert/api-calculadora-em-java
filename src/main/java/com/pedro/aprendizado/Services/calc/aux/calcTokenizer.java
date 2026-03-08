package com.pedro.aprendizado.Services.calc.aux;

import java.util.ArrayList;
import java.util.List;

public class calcTokenizer {

  public static List<String> tokenizar(String equacao) {
    List<String> token = new ArrayList<>();
    int i = 0;

    while (i < equacao.length()) {
      char ch = equacao.charAt(i);
      if (Character.isDigit(ch)) {
        StringBuilder num = new StringBuilder();
        while (i < equacao.length() && ((ch = equacao.charAt(i)) == '.' || Character.isDigit(ch))) {
          num.append(ch);
          i++;
        }
        token.add(num.toString());
      }
      if ("+-*/()".indexOf(ch) != -1) {
        token.add(Character.toString(ch));
      }

      i++;
    }
    return token;
  }

}

/*
 * 2*3*4+5 => (2*(3*4))+5
 *
 * +
 * / \
 * * 5
 * / \
 * 2 *
 * / \
 * 3 4
 *
 * 2*3*4+5
 *
 * 2 3 * 4 * 5 +
 *
 */
