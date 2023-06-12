package Bola;

public class Bola {
    private double circunferencia;
    private String cor;
    private String marca;
    private String material;
    private double velocidade;

    public Bola(double circunferencia, String cor, String marca, String material, double velocidade) {
        this.circunferencia = circunferencia;
        this.cor = cor;
        this.marca = marca;
        this.material = material;
        this.velocidade = velocidade;

    }
    public void trocaCor(String novaCor) {
        cor = novaCor;
    }
    public void mostraCor() {
        System.out.println("A cor da bola é: " + cor);

    }

    }




