package Exercicio2;

// TODO: 12/06/2023 Classe Pessoa: Crie uma classe que modele uma pessoa, toda pessoa contém nome, idade, peso e altura.
//  No construtor, o peso é opcional, com valor default (padrão) zero e os demais atributos são obrigatórios.
//  Métodos: Envelhecer, engordar, emagrecer, crescer. Obs: Por padrão, a cada ano que nossa pessoa envelhece,
//  sendo a idade dela menor que 21 anos, ela deve crescer 0,5 cm.
public class Pessoa {

    String nome;
    int idade;
    int idadeAtual;
    double peso = 0;
    double altura;




    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdadeAtual(int idadeAtual) {
        this.idadeAtual = idadeAtual;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }


    public double getAltura() {
        return altura;
    }

    public void Envelhecer() {

    }

    public void Engordar(double ganhoPeso) {

        peso += ganhoPeso;
    }

    public void Emagrecer(double perderPeso) {
        peso -= perderPeso;

    }

    public void Crescer() {

        if (idade >= 21) {
            double aumento = (idade - 21) * 0.5; // Aumento de 0,5 cm por ano após os 21 anos
            altura += aumento;
        }
    }


}
