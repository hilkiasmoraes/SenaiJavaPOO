package models;

public class Carro extends Veiculo {
    public Long Id;
    public String modelo;
    public int ano;
    public String cor;

    public void exibirInfo() {
        System.out.println("ID: " + Id + ", Modelo: " + modelo + ", Ano: " + ano + ", Cor: " + cor);
    }


    @Override
    public void moverVeiculo() {
        System.out.println("Carro em movimento");
        System.out.println("Carro em alta velocidade");
    }
}