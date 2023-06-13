package Exercicio5;

import java.util.Scanner;

public class AreaQuadrado {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Quadrado quadrado = new Quadrado();

        System.out.println("Digite o tamanho do lado do quadrado:");
        System.out.println("Lembrando que a área do quadrado é lado X lado.");
        double lado = entrada.nextDouble();
        quadrado.setLado(lado);

        double area = quadrado.calcularArea();
        System.out.println("Área do quadrado: " + area);
    }
}