package ex001;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Conta c1 = new Conta("Mario", 5000);
        Conta c2 = new Conta("Link", 3000);

        System.out.println("Digite um valor para transferir: ");
        double valorTransferir = teclado.nextDouble();
        boolean sucessoLeitura = false;

        while(!sucessoLeitura) {
            try {
                c1.transferir(valorTransferir, c2);
                c1.info();
                c2.info();
                sucessoLeitura = true;
            } catch (Exception e) {
                System.out.println("Ocorreu um erro, tente outro valor");
                System.out.println(e.getMessage());
                System.out.println("Digite um valor para transferir: ");
                valorTransferir = teclado.nextDouble();
            } finally {
                System.out.println("Fechando o programa");
            }
        }

    }
}