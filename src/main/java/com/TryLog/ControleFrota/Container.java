package com.TryLog.ControleFrota;

public class Container implements Transportador{
  private String modelo;
  private double capacidade;

  public Container(String modelo, double capacidade) {
    this.modelo = modelo;
    this.capacidade = capacidade;
  }

  @Override
  public void transportar(String origem, String destino) {
    System.out.printf("Esse container será usado para transportar a carga de %s para %s.", origem, destino);
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public double getCapacidade() {
    return capacidade;
  }

  public void setCapacidade(double capacidade) {
    this.capacidade = capacidade;
  }
}
