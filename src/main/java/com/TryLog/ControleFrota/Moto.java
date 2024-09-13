package com.TryLog.ControleFrota;

public class Moto extends Veiculo{

  public Moto(String placa, int anoFabricacao) {
    super(placa, anoFabricacao);
    this.setCombustivel("Gasolina");
  }

  @Override
  public void abastecer(String local, String motorista, double valor) {
    this.getAbastecimento().add(String.format("Local: %s, Motorista: %s, Valor: %.2f", local, motorista, valor));
  }
}
