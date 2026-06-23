package Carros;

public class Carro {

    String modelo;
    String cor;
    int ano;
    protected String placa;

    // package private: visível somente por classes no mesmo pacote
    // protected: visível somente por classes no mesmo pacote e subclasses da classe em que está presente

    public Carro(String modelo, String cor, int ano, String placa) {
        this.ano = ano;
        this.cor = cor;
        this.modelo = modelo;
        this.placa = placa;
    }

    // Métodos public: são visíveis pelo sistema inteiro

    public void ligar() {
        System.out.println("Carro ligado");
    }

    public void desligar() {
        System.out.println("Carro desligado");
    }

    // Métodos Package Private: não tem modificador de acesso, só é visível no pacote em que está

    void teste() {
        System.out.println("Teste");
    }

}
