package Pessoa;

public class Pessoa {

    private String nome;
    private int idade;
    private double peso;
    private double altura;

    public Pessoa(String nome, int idade, double altura) {
        
        this (nome, idade,0, altura);
        
        
        
    }

    public Pessoa(String nome, int idade, int altura, double altura1) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
        }

    public void envelhecer(int anos) {
        if (anos < 0) return; // Não permitir envelhecer negativamente

        for (int i = 1; i <= anos; i++) {
            this.idade++;

            if (this.idade < 21) {
                this.crescer(0.5) ;



            }
        }

    }
    public void engordar(double quilos) {
        if (quilos > 0) {
            this.peso += quilos;

        }
    }
    public void crescer(double centimetros) {
        if (centimetros > 0) {
            this.altura += centimetros / 100.0; // altura está em metros
        }

        }
    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Altura: " + altura + " m");

}


    }
