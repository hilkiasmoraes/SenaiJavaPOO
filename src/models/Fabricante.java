package models;

public class Fabricante extends ModeloAno {
    public Long Id;
    public String modelo;
    public int ano;
    public String cor;

    @Override
    public void veiculoDoAno() {
        System.out.println("Carro de corrida ABCD");
    }
}
