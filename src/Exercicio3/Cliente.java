package Exercicio3;
// TODO: 12/06/2023 Classe Conta Corrente: Crie uma classe para construir uma conta corrente. A classe deve possuir os
//  seguintes atributos: número da conta, nome do correntista e saldo. No construtor, o saldo é opcional,
//  com valor default (padrão) zero e os demais atributos são obrigatórios.
//  Método: depositoConta e saqueConta.
import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ContaCorrente cliente = new ContaCorrente(141,"Wellington");


        System.out.println("Olá Sr(a)." + cliente.getNomeCorrentista());
        System.out.println("O número de sua conta é " + cliente.getNumeroConta());


        System.out.println("O que deseja para hoje: ");
        System.out.println("1 - Ver saldo");
        System.out.println("0 - Sair");

        int opcao = entrada.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Seu saldo é R$" + cliente.getSaldo(2000));
                break;
            case 0:
                System.out.println("Saindo do programa...");
                break;
            default:
                System.out.println("Opção inválida.");
        }




    }
}
