import models.Carro;

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.modelo = "Toyota Corolla";
        carro1.ano = 2022;
        carro1.cor = "Branco";
        carro1.exibirInfo();
    }
}