package Bola;

public class MainBola {
    public static void main(String[] args) {
        Bola bola1 = new Bola(10.0, "Azul", "Nike", "Couro", 0.0);
        Bola bola2 = new Bola(8.0, "Vermelho", "Adidas", "Borracha", 0.0);

        bola1.mostraCor ();
        bola1.trocaCor("Amarelo");
        bola1.mostraCor();


    }
}
