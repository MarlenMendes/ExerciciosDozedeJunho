package Quadrado;

public class Quadrado {

    private double tamanhoDoLado;

    public Quadrado(double tamanhoDoLado) {
        this.tamanhoDoLado = tamanhoDoLado;
    }
    public void mudarValorDoLado(double novoTamanho) {
        if (novoTamanho > 0) {
            this.tamanhoDoLado = novoTamanho;
        } else {
            System.out.println("Valor inválido.");

        }
        }
    public double retornarValorDoLado() {
        return this.tamanhoDoLado;
    }
    public double calcularArea() {
        return this.tamanhoDoLado * this.tamanhoDoLado;

    }
    }
