package com.TryLog.ControleFrota;

public class Carro extends Veiculo{

  public Carro(String placa, int anoFabricacao) {
    super(placa, anoFabricacao);
    this.setCombustivel("Flex");
  }

  @Override
  public void abastecer(String local, String motorista, double valor) {
    this.getAbastecimento().add(String.format("Local: %s, Motorista: %s, Valor: %.2f", local, motorista, valor));
  }
}
