package Pessoa;

public class MainPessoa {
    public static void main(String[] args) {

        // Criando uma nova pessoa
        Pessoa pessoa1 = new Pessoa("João", 20, 1.70);

        // Exibindo dados antes de envelhecer
        System.out.println("Dados iniciais:");

        pessoa1.exibirDados();

        // Envelhecendo 2 anos
        pessoa1.envelhecer(2);

        // Engordando 3 quilos
        pessoa1.engordar(3);

        // Exibindo dados após envelhecer e engordar
        System.out.println("\nDados após envelhecer 2 anos e engordar 3 quilos:");
        pessoa1.exibirDados();



    }
}
