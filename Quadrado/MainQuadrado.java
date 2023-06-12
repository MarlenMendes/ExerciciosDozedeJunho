package Quadrado;

public class MainQuadrado {

    public static void main(String[] args) {

        Quadrado meuQuadrado = new Quadrado(4);
        System.out.println("Tamanho do lado: " + meuQuadrado.retornarValorDoLado());
        System.out.println("Área do quadrado: " + meuQuadrado.calcularArea());

        meuQuadrado.mudarValorDoLado(5);

        System.out.println("\nNovo tamanho do lado: " + meuQuadrado.retornarValorDoLado());
        System.out.println("Nova área do quadrado: " + meuQuadrado.calcularArea());


    }
}
