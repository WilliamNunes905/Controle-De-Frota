package com.TryLog.ControleFrota;

public class Moto extends Veiculo{

  public Moto(String placa, int anoFabricacao, String combustivel) {
    super(placa, anoFabricacao, combustivel);
  }

  @Override
  public void abastecer(String local, String motorista, double valor) {
    this.getAbastecimento().add(String.format("Local: %s, Motorista: %s, Valor: %.2f", local, motorista, valor));
  }
}
