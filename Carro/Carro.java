package Carro;

public class Carro {

    private int quantidadeDePortas;
    private String modelo;
    private String marca;
    private double potencia;
    private boolean estaLigado;

    public Carro(int quantidadeDePortas, String modelo, String marca) {
        this(quantidadeDePortas, modelo, marca, 2.0); // potência default é 2.0

        }
    public Carro(int quantidadeDePortas, String modelo, String marca, double potencia) {
        this.quantidadeDePortas = quantidadeDePortas;
        this.modelo = modelo;
        this.marca = marca;
        this.potencia = potencia;
        this.estaLigado = false;

    }
    public void ligarCarro() {
        this.estaLigado = true;
        System.out.println("O carro foi ligado.");

    }
    public void exibirDados() {
        System.out.println("Quantidade de portas: " + quantidadeDePortas);
        System.out.println("Modelo: " + modelo);
        System.out.println("Marca: " + marca);
        System.out.println("Potência: " + potencia);
        System.out.println("Está ligado: " + (estaLigado ? "Sim" : "Não"));

    }
}
