package com.TryLog.ControleFrota;

import java.util.ArrayList;

public class Caminhao extends Veiculo implements Transportador {
  private ArrayList<String> viajem;

  public Caminhao(String placa, int anoFabricacao) {
    super(placa, anoFabricacao);
    this.setCombustivel("Diesel");
    this.viajem = new ArrayList<>();
  }

  @Override
  public void abastecer(String local, String motorista, double valor) {
    this.getAbastecimento().add(String.format("Local: base, Motorista: %s, Valor: %.2f", motorista, valor));
  }

  public void abastecer(String motorista, double valor) {
    this.getAbastecimento().add(String.format("Local: base, Motorista: %s, Valor: %.2f", motorista, valor));
  }

  @Override
  public void transportar(String origem, String destino) {
    this.getViajem().add(String.format("Veiculo de placa %s, vai transportar a carga de %s para %s.", this.getPlaca(), origem, destino));
  }

  public void listaViajem() {
    System.out.println("##------ Lista de Viajem do Veiculo: " + getPlaca() + " ------##");
    for (String viajem : this.viajem) {
      System.out.println("|  " + viajem + "  |");
    }
    System.out.println("##----------------------####--####------------------------##");
  }

  public ArrayList<String> getViajem() {
    return viajem;
  }

  public void setViajem(ArrayList<String> viajem) {
    this.viajem = viajem;
  }
}
