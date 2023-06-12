package ContaCorrente;

public class MainContaCorrente {
    public static void main(String[] args) {

        ContaCorrente conta1 = new ContaCorrente("12345", "Maria");

        System.out.println("Dados iniciais da conta:");
        conta1.exibirDados();

        conta1.depositoConta(200);
        conta1.saqueConta(50);

        System.out.println("\nDados após depósito de 200 e saque de 50:");
        conta1.exibirDados();

    }
}

