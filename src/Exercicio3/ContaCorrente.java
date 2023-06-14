package Exercicio3;

public class ContaCorrente {
    Integer numeroConta;
    String nomeCorrentista;
    double saldo;

    public ContaCorrente(Integer numeroConta, String nomeCorrentista) {
        this.numeroConta = numeroConta;
        this.nomeCorrentista = nomeCorrentista;
        this.saldo = 0;
    }

    public Integer getNumeroConta() {
        return numeroConta;
    }

    public String getNomeCorrentista() {
        return nomeCorrentista;
    }

    public double getSaldo(int saldo) {
        return saldo;
    }

}
