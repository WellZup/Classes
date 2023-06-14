package Exercicio4;

import java.util.Scanner;

public class EscolhaCarro {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Carro carro = new Carro();

        System.out.println("Olá, vamos montar seu tipo de carro.");
        System.out.println("Digite o modelo que prefere");
        System.out.println("1 - FIAT");
        System.out.println("2 - FORD");
        System.out.println("3 - VOLKSWAGEN");
        System.out.println("4 - TOYOTA");
        System.out.println("5 - RANGER ROVER");

        System.out.println();

        int opcaoMarca = entrada.nextInt();

        switch (opcaoMarca) {
            case 1:
                carro.setModelo("FIAT");
                carro.setMarca("Uno");
                System.out.println("Ótima escolha");

                break;
            case 2:
                carro.setModelo("FORD");
                carro.setMarca("KA");
                System.out.println("Ótima escolha");

                break;
            case 3:
                carro.setModelo("VOLKSWAGEN");
                carro.setMarca("UP");
                System.out.println("Ótima escolha");

                break;
            case 4:
                carro.setModelo("TOYOTA");
                carro.setMarca("Corolla");
                System.out.println("Ótima escolha");

                break;
            case 5:
                carro.setModelo("RANGER ROVER");
                carro.setMarca("Sport");
                System.out.println("Ótima escolha");

                break;
            case 0:
                System.out.println("Saindo do programa...");
                break;
            default:
                System.out.println("Opção inválida.");
        }

        System.out.println();




        System.out.println("    Escolha a quantidade de portas.");
        System.out.println("    Quantidade de portas: ");
        System.out.println("1 - 2 Portas");
        System.out.println("2 - 4 Portas");

        int opcaoPortas = entrada.nextInt();

        switch (opcaoPortas) {
            case 1:
                carro.setQtPortas(("2 Portas"));
                System.out.println("Ótima escolha");

                break;
            case 2:
                carro.setQtPortas(("4 Portas"));
                System.out.println("Ótima escolha");

                break;
            case 0:
                System.out.println("Saindo do programa...");
                break;
            default:
                System.out.println("Opção inválida.");
        }

        System.out.println();


        System.out.println("    Marcar escolhida \n" + carro.modelo);
        System.out.println("    Quantidade de portas \n" + carro.qtPortas);
        System.out.println("    Carro escolhido à força \n" + carro.marca);
        carro.ligarCarro();


    }


}
