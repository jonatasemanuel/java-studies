package empresa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int peso;
        double altura;

        System.out.println("Digite peso seguido de altura");
        Scanner teclado = new Scanner(System.in);
        peso = teclado.nextInt();
        altura = teclado.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println("IMC: " + imc);
    }
}