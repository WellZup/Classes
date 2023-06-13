package Exercicio6;

public class Retangulo {
    double ladoA;
    double ladoB;

    public double getLadoA() {
        return ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public double calcularArea(){
        return ladoA * ladoB;
    }

    public double calcularPerimetro(){
        return (ladoA * ladoB)*2 ;
    }
    public void mudarLado(double novoLadoA, double novaLadoB){
        ladoA = novoLadoA;
        ladoB = novaLadoB;

    }

}
