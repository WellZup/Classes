package Exercicio8;
import java.util.Scanner;
public class CreditoOuDebito {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Caixa caixa = new Caixa();

        System.out.println("Bem-vindo ao caixa!");
        System.out.println("Saldo inicial: R$" + caixa.saldo);

        System.out.println("Quantos lançamentos deseja realizar?");
        int quantidadeLancamentos = entrada.nextInt();

        for (int i = 1; i <= quantidadeLancamentos; i++) {
            System.out.println("Lançamento " + i);
            System.out.println("Deseja fazer um crédito (C) ou débito (D)?");
            String opcao = entrada.next();

            if (opcao.equalsIgnoreCase("C")) {
                System.out.println("Digite o valor do crédito:");
                double valorCredito = entrada.nextDouble();
                caixa.credito(valorCredito);
            } else if (opcao.equalsIgnoreCase("D")) {
                System.out.println("Digite o valor do débito:");
                double valorDebito = entrada.nextDouble();
                caixa.debito(valorDebito);
            } else {
                System.out.println("Opção inválida. Ignorando lançamento.");
            }
        }

        System.out.println("Saldo final: R$" + caixa.saldo);
    }
}
