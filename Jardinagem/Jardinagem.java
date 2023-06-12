package Jardinagem;

public class Jardinagem {

    private String nomeJardim;
    private double qtdMetros;
    private int qtdPlantas;
    private double qtdMetrosGrama;
    private double gramaAdubo;
    private double valorAdubo;
    private double valorMetroGrama;
    private double valorCorteGrama;

    public Jardinagem(String nomeJardim, double qtdMetros, int qtdPlantas, double qtdMetrosGrama,
                      double gramaAdubo, double valorAdubo, double valorMetroGrama) {
        this.nomeJardim = nomeJardim;
        this.qtdMetros = qtdMetros;
        this.qtdPlantas = qtdPlantas;
        this.qtdMetrosGrama = qtdMetrosGrama;
        this.gramaAdubo = gramaAdubo;
        this.valorAdubo = valorAdubo;
        this.valorMetroGrama = valorMetroGrama;

    }
    public double usarAdubo() {
        return (qtdMetrosGrama / 2) * 100; // a cada 2 metros de grama usa-se 100 gramas de adubo
    }
    public double precoAdubo() {
        return usarAdubo() * valorAdubo;

    }
    public double precoCorteGrama() {
        valorCorteGrama = qtdMetrosGrama * valorMetroGrama;
        return valorCorteGrama;

    }
}
