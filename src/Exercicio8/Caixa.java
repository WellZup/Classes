package Exercicio8;

// TODO: 12/06/2023 Classe Caixa: Crie uma classe que modele um caixa, que contém saldo - no construtor
//  começa com R$1000,00, crédito, débito. Crie método
//  Métodos: crédito que entra dinheiro e débito que sai dinheiro. - no main tenha laço perguntando quantos lançamentos
//  deseja e sempre pergunte se crédito ou débito e no final fala o saldo final.
public class Caixa {
    double saldo;

    public Caixa() {
        this.saldo = 1000.00;
    }

    public void credito(double valor) {
        saldo += valor;
    }

    public void debito(double valor) {
        saldo -= valor;
    }
}
