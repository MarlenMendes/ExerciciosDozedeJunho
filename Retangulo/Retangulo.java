package Retangulo;

public class Retangulo {

    private double ladoA;
    private double ladoB;

    public Retangulo(double ladoA, double ladoB) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }
    public void mudarValorDosLados(double novoLadoA, double novoLadoB) {
        if (novoLadoA > 0 && novoLadoB > 0) {
            this.ladoA = novoLadoA;
            this.ladoB = novoLadoB;
        } else {
            System.out.println("Valores inválidos.");

        }

    }
    public double[] retornarValorDosLados() {

        return new double[]{this.ladoA, this.ladoB};

    }
    public double calcularArea() {
        return this.ladoA * this.ladoB;

    }
    public double calcularPerimetro() {
        return 2 * (this.ladoA + this.ladoB);

    }
}