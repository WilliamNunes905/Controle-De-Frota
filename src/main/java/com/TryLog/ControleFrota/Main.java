package com.TryLog.ControleFrota;

public class Main {
  public static void main(String[] args) {
    Carro carro1 = new Carro("RTF-281", 2015);
    Caminhao caminhao1 = new Caminhao("LTH-982", 2010);

    carro1.abastecer("Posto 1", "Victor", 100.00);
    carro1.abastecer("Posto 2", "Victor", 120.00);
    carro1.abastecer("Posto 3", "paulo", 90.00);
    carro1.abastecer("Posto 4", "paulo", 50.00);
    carro1.listaAbastecimento();

    caminhao1.abastecer(null, "João", 2500.00);
    caminhao1.abastecer(null, "João", 2500.00);
    caminhao1.transportar("Canoas", "São Paulo");

    caminhao1.abastecer(null, "Ana", 1500.00);
    caminhao1.abastecer(null, "Ana", 3000.00);
    caminhao1.transportar("São Paulo", "Rio de Janeiro");

    caminhao1.listaAbastecimento();
    caminhao1.listaViajem();
  }
}