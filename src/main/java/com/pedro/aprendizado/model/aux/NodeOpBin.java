package com.pedro.aprendizado.model.aux;

public class NodeOpBin implements Node {

  String op;
  Node esq;
  Node dir;

  public NodeOpBin(String op) {
    this.op = op;
  }

  public double get_valor() {
    switch (op) {
      case "+":
        return esq.get_valor() + dir.get_valor();
      case "-":
        return esq.get_valor() - dir.get_valor();
      case "*":
        return esq.get_valor() * dir.get_valor();
      case "/":
        return esq.get_valor() / dir.get_valor();
      default:
        return 0.0;
    }
  }

  public Node Esq() {
    return esq;
  }

  public void SetEsq(Node node) {
    this.esq = node;
  }

  public Node Dir() {
    return dir;
  }

  public void SetDir(Node node) {
    this.dir = node;
  }
}
