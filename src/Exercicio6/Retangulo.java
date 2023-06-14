package Exercicio6;

public class Retangulo {
    double ladoA;
    double ladoB;


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
