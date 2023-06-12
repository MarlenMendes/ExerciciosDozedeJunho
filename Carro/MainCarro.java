package Carro;

public class MainCarro {

    public static void main(String[] args) {

        Carro meuCarro = new Carro(4, "Fusca", "Volkswagen");

        System.out.println("Dados iniciais do carro:");
        meuCarro.exibirDados();

        meuCarro.ligarCarro();

        System.out.println("\nDados após ligar o carro:");
        meuCarro.exibirDados();

    }
}
