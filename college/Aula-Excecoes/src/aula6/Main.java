package aula6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int[] numeros = {1,2,3};
//        try {
//            System.out.println(numeros[10]);
//        }
//        catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("Fora do limite!");
//        }
//        catch (Exception e) {
//            System.out.println("Ocorreu um problema: " + e.getMessage());
//        }
//        finally {
//            System.out.println("Finalizando o programa");
//        }
        System.out.println("Digite um valor entre 0 e 10");
        Scanner teclado = new Scanner(System.in);
        int valor = teclado.nextInt();

        if (valor > 10 || valor <0) {
            throw new RuntimeException("Valor invalido");
        }

    }
}