package Jardinagem;

public class MainJardinagem {
    public static void main(String[] args) {
        Jardinagem meuJardim = new Jardinagem("Jardim Feliz", 20.0, 10, 10.0, 500, 2.0, 5.0);

        double aduboUsado = meuJardim.usarAdubo();
        System.out.println("Quantidade de adubo usado: " + aduboUsado + " gramas");

        double precoDoAdubo = meuJardim.precoAdubo();
        System.out.println("Preço do adubo: $" + precoDoAdubo);

        double precoCorte = meuJardim.precoCorteGrama();
        System.out.println("Preço do corte de grama: $" + precoCorte);

    }
    }
