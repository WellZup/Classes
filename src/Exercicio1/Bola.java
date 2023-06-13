package Exercicio1;

// TODO: 12/06/2023 Classe Bola: Crie uma classe que modele uma bola, toda bola contém uma as entidades circunferência,
//  cor, marca, material e velocidade e os métodos: trocaCor e mostraCor. Após a modelagem, instanciar objetos
//  diferentes no método main para testes.
public class Bola {

    Integer circunferencia;
    String cor;
    String marca;
    String material;

    public void status(){
        System.out.println("Bola de circunference: " + this.circunferencia + "cm");
        System.out.println("Bola de marca: " + this.marca);
        System.out.println("De material: " + this.material);
    }

    public void mostrarCor(){
        System.out.println("Bola de cor: " + this.cor);
    }
    public void trocaCor(String novacor){
        this.cor = novacor;
        System.out.println("A bola mudou de cor para: " + novacor);
    }
}
