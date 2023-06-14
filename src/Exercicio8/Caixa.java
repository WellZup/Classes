package Exercicio8;

// TODO: 12/06/2023 Classe Caixa: Crie uma classe que modele um caixa, que contém saldo - no construtor
//  começa com R$1000,00, crédito, débito. Crie método
//  Métodos: crédito que entra dinheiro e débito que sai dinheiro. - no main tenha laço perguntando quantos lançamentos
//  deseja e sempre pergunte se crédito ou débito e no final fala o saldo final.
public class Caixa {
    private double saldo;

    public static final String ANSI_RESET = "\u001B[0m";
    // Declaring the background color
    public static final String ANSI_RED_BACKGROUND= "\u001B[41m";

    public double getSaldo() {
        return saldo;
    }

    public Caixa() {
        this.saldo = 1000.00;
    }

    public void credito(double valor) {
        saldo += valor;
    }

    public void debito(double valor) {
        if (valor <= saldo){
        saldo -= valor;
        }else {
            System.out.println(ANSI_RED_BACKGROUND
                    + "Saldo insuficiente para retirada"
                    + ANSI_RESET);
        }
    }

    public void printSaldo() {
        System.out.println("Seu saldo é: R$" + this.saldo);
    }
}

