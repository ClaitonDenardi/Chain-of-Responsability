package model;

import enumeracao.Moedas;

public abstract class Chain {
  protected Chain next;
  public abstract float tipoDeMoeda(Moedas moeda);

  public void setNext(Chain next) {
    this.next = next;
  }
}