package com.pedro.aprendizado.model.aux;

public class NodeValor implements Node {

  double valor;

  public NodeValor(double valor) {
    this.valor = valor;
  }

  public double get_valor() {
    return valor;
  }
}
