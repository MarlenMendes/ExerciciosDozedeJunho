package ContaCorrente;

public class ContaCorrente {

    private String numeroDaConta;
    private String nomeDoCorrentista;
    private double saldo;

    public ContaCorrente(String numeroDaConta, String nomeDoCorrentista) {
        this(numeroDaConta, nomeDoCorrentista, 0);

    }
    public ContaCorrente(String numeroDaConta, String nomeDoCorrentista, double saldo) {
        this.numeroDaConta = numeroDaConta;
        this.nomeDoCorrentista = nomeDoCorrentista;
        this.saldo = saldo;

    }
    public void depositoConta(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        } else {
            System.out.println("Valor de depósito inválido.");

        }
    }
    public void saqueConta(double valor) {

        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
        } else {
            System.out.println("Valor de saque inválido ou saldo insuficiente.");
        }
    }
    public void exibirDados() {
        System.out.println("Número da conta: " + numeroDaConta);
        System.out.println("Nome do correntista: " + nomeDoCorrentista);
        System.out.println("Saldo: " + saldo);

    }

}

