package Caixa;

public class Caixa {
    private double saldo;

    public Caixa() {
        this.saldo = 1000.0; // saldo inicial de R$ 1000,00

    }
    public void credito(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        } else {
            System.out.println("Valor inválido para crédito.");

        }
    }
    public void debito(double valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
        } else {
            System.out.println("Valor inválido para débito.");

        }
    }
    public double getSaldo() {
        return this.saldo;

    }

}
