package Exercicio5;

// TODO: 12/06/2023  Classe Quadrado: Crie uma classe que modele um quadrado:
//  Atributos: Tamanho do lado
//  Métodos: Mudar valor do Lado, Retornar valor do Lado e calcular Área;
public class Quadrado {
    double lado;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double calcularArea() {
        return lado * lado;
    }
}
