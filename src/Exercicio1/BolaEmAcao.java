package Exercicio1;

public class BolaEmAcao {
    public static void main(String[] args) {

        Bola bola1 = new Bola();

        bola1.cor = "Azul";
        bola1.circunferencia = 24;
        bola1.marca = "Ball";
        bola1.material = "Couro";

        bola1.status();
        bola1.mostrarCor();
        bola1.trocaCor("Vermelho");


    }
}
