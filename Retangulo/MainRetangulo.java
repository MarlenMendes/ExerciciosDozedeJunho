package Retangulo;

import java.util.Arrays;

public class MainRetangulo {

        public static void main(String[] args) {

            Retangulo meuRetangulo = new Retangulo(4, 5);

            System.out.println("Tamanho dos lados: " + Arrays.toString(meuRetangulo.retornarValorDosLados()));
            System.out.println("Área do retângulo: " + meuRetangulo.calcularArea());
            System.out.println("Perímetro do retângulo: " + meuRetangulo.calcularPerimetro());


            meuRetangulo.mudarValorDosLados(6, 7);

            System.out.println("\nNovo tamanho dos lados: " + Arrays.toString(meuRetangulo.retornarValorDosLados()));
            System.out.println("Nova área do retângulo: " + meuRetangulo.calcularArea());
            System.out.println("Novo perímetro do retângulo: " + meuRetangulo.calcularPerimetro());
        }

        }

