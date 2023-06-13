package Exercicio4;

// TODO: 12/06/2023 Crie uma classe para modelar um carro. Todo carro tem quantidade de portas, modelo, marca e potência
//  No construtor, a potência é opcional, com valor default (padrão) 2.0 e os demais atributos são obrigatórios.
//  Métodos ligarCarro.
public class Carro {

    String qtPortas;
    String modelo;
    String marca;
    double potencia;

    public Carro() {
        this.qtPortas = qtPortas;
        this.modelo = modelo;
        this.marca = marca;
        this.potencia = 2.0;
    }

    public void ligarCarro(){
        System.out.println("Está na hora do show!");
    }

    public void setQtPortas(String qtPortas) {
        this.qtPortas = qtPortas;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
