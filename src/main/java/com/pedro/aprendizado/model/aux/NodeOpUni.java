package com.pedro.aprendizado.model.aux;

public class NodeOpUni implements Node {
  Node next;
  String op;

  public NodeOpUni(String op) {
    this.op = op;
  }

  public double get_valor() {
    if (op == "-") {
      return 0.0 - next.get_valor();
    }
    return next.get_valor();
  }

}
