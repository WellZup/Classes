package Exercicio6;

import java.util.Scanner;

public class CalcularRetangulo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Retangulo retangulo = new Retangulo();

        System.out.println("Digite o valor do lado A do retângulo: ");
        double ladoA = entrada.nextDouble();

        System.out.println("Digite o valor do lado B do retângulo: ");
        double ladoB = entrada.nextDouble();

        retangulo.mudarLado(ladoA, ladoB);

        double area = retangulo.calcularArea();
        double perimetro = retangulo.calcularPerimetro();

        System.out.println("A área do retângulo é: " + area);
        System.out.println("O perímetro do retângulo é: " + perimetro);

    }
}
