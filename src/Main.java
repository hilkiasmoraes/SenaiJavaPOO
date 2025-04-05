import models.Carro;
import models.Fabricante;

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.Id = 777L;
        carro1.modelo = "Toyota Corolla";
        carro1.ano = 2022;
        carro1.cor = "Branco";
        carro1.exibirInfo();

        System.out.println("Conceito de Abstração ------------------------");
        carro1.moverVeiculo();


        System.out.println("Conceito de Polimorfismo ---------------------");
        Fabricante fabricante = new Fabricante();
        fabricante.veiculoDoAno();
    }
}