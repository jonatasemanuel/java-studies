package classes;

public class Carro {
    String nome;
    String modelo;
    float velocidade;

    // Atibuto estatico
    static final double PI = 3.1415;
    // final para constantes -> nao permite mudancas


    // Metodo estatico que vai transformar milhas em metros
    static float milhasParaMetodos(float milhas){
        return milhas*1600;
    }
}
