package models;

public class Carro {
    public String modelo;
    public int ano;
    public String cor;

    public void exibirInfo() {
        System.out.println("Modelo: " + modelo + ", Ano: " + ano + ", Cor: " + cor);
    }
}