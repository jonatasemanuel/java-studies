package trezentos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int palpite;
        int valorCorreto=10000;

        System.out.println("Digite seu palpite: ");
        palpite = teclado.nextInt();

        String msg;
//        int idade=10;

//      Python:  and, or,        if not idade
//      Java:    &&,  ||(pipes), if (!(idade > 5))

        while (palpite != valorCorreto) {
//           O perador ternario
             msg = palpite>valorCorreto?"Um pouco menos...":"Um pouco mais...";
             System.out.println(msg);

/*
            if(palpite>valorCorreto) {
                System.out.println("Um pouco menos...");
            }
            else {
                System.out.println("Um pouco mais...");
            }
*/

            System.out.println("Digite outro palpite: ");
            palpite = teclado.nextInt();
        }

        System.out.println("Acertou mizáravi");

    }
}