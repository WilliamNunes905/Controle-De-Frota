package com.TryLog.ControleFrota;

public class Carro extends Veiculo{

  public Carro(String placa, int anoFabricacao, String combustivel) {
    super(placa, anoFabricacao, combustivel);
  }

  @Override
  public void abastecer(String local, String motorista, double valor) {
    this.getAbastecimento().add(String.format("Local: %s, Motorista: %s, Valor: %.2f", local, motorista, valor));
  }
}
