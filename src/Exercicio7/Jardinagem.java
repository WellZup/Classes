package Exercicio7;

// TODO: 12/06/2023 Classe Jardinagem: Entidades: nomeJardim, qtdMetros, qtdPlantas, qtdMetrosGrama, gramaAdubo,
//  valorAdubo, valorMetroGrama, valorConteGrama. métodos: usarAdubo (a cada 2 metros de grama (qtdMetrosGrama)
//  usa-se 100 gramas de adubo (gramaAdubo) - calcule quanto de adubo usar).
//  precoAdubo ( resultado do usarAdubo  * valorAdubo)
//  precoCorteGrama (valorConteGrama = qtdMetrosGrama * valorMetroGrama)).
public class Jardinagem {
    String nomeJardim;
    double qtdMetros;
    double qtdPlantas;
    double qtdMetrosGrama;
    double gramaAdubo;
    double valorAdubo;
    double valorMetroGrama;
    double valorConteGrama;

    public Jardinagem(String nomeJardim, double qtdMetros, double qtdPlantas, double qtdMetrosGrama, double gramaAdubo,
                      double valorAdubo, double valorMetroGrama, double valorConteGrama) {
        this.nomeJardim = nomeJardim;
        this.qtdMetros = qtdMetros;
        this.qtdPlantas = qtdPlantas;
        this.qtdMetrosGrama = qtdMetrosGrama;
        this.gramaAdubo = gramaAdubo;
        this.valorAdubo = valorAdubo;
        this.valorMetroGrama = valorMetroGrama;
        this.valorConteGrama = valorConteGrama;
    }

    public double usarAdubo(){
        return (qtdMetrosGrama /2) * gramaAdubo;
    }

    public double precoAdubo(){
        var aduboUsado = usarAdubo();
        return aduboUsado = valorAdubo;
    }

    public double precoCorteGrama(){
        return valorConteGrama = (qtdMetrosGrama*valorMetroGrama);
    }

}
