package Pessoas;

import Carros.Carro;

public class CarroPessoa extends Carro {

    public CarroPessoa(String modelo, String cor, int ano, String placa) {
        super(modelo, cor, ano, placa);
        // placa: pode ser acessado pois é protected, e o restante é public (e não package private)
    }

    @Override
    public void ligar() {
        super.ligar();
    }

    @Override
    public void desligar() {
        super.desligar();
    }
}
