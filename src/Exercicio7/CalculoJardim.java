package Exercicio7;

public class CalculoJardim {
    public static void main(String[] args) {
        Jardinagem jardinagem = new Jardinagem("Meu Jardim", 100.0, 10, 50.0,
                100.0, 10.0, 5.0, 2.0);

        double aduboUsado = jardinagem.usarAdubo();
        double precoAdubo = jardinagem.precoAdubo();
        double precoCorteGrama = jardinagem.precoCorteGrama();

        System.out.println("Adubo usado: " + aduboUsado + " gramas");
        System.out.println("Preço do adubo: R$" + precoAdubo);
        System.out.println("Preço do corte de grama: R$" + precoCorteGrama);
    }

}
