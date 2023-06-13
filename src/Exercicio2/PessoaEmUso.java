package Exercicio2;

import java.util.Scanner;

public class PessoaEmUso {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome: ");
        String nome = scanner.nextLine();
        pessoa.setNome(nome);

        System.out.println("Digite a idade atual: ");
        int idadeatual = scanner.nextInt();
        pessoa.setIdadeAtual(idadeatual);

        System.out.println("Digite a altura em cm: ");
        double altura = scanner.nextDouble();
        pessoa.setAltura(altura);

        System.out.println("Digite a idade que deseja saber sua altura : ");
        int idade = scanner.nextInt();
        pessoa.setIdade(idade);

        pessoa.Crescer();

        // Exibir os dados da pessoa
        System.out.println("Dados informados para saber altura futura:");
        System.out.println("Nome: " + pessoa.nome);
        System.out.println("Idade atual: " + pessoa.idadeAtual + " anos");
        System.out.println("Sua altura quando tiver " + pessoa.idade + " anos" + ", será de: " + pessoa.getAltura() + "cm");
    }


}