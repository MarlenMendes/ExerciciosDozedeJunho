package Caixa;

import java.util.Scanner;

public class MainCaixa {
    public static void main(String[] args) {

        Caixa caixa = new Caixa();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos lançamentos você deseja fazer? ");
        int numLancamentos = scanner.nextInt();

        for (int i = 0; i < numLancamentos; i++) {
            System.out.print("Lançamento " + (i + 1) + " - Digite 'c' para crédito ou 'd' para débito: ");
            String tipo = scanner.next();
            System.out.print("Digite o valor: R$ ");
            double valor = scanner.nextDouble();

            if ("c".equalsIgnoreCase(tipo)) {
                caixa.credito(valor);
            } else if ("d".equalsIgnoreCase(tipo)) {
                caixa.debito(valor);
            } else {
                System.out.println("Opção inválida.");

            }
            }
        System.out.println("Saldo final: R$ " + caixa.getSaldo());
        scanner.close();



    }
}
