package study;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //array
        //int megaSena[] = {10, 20, 30, 40, 50, 55};

        Scanner teclado = new Scanner(System.in);

        ArrayList<String> listaNomes = new ArrayList<String>();
        System.out.println("Digite a quantidade de nomes: ");

        int qtd = teclado.nextInt();
        String nome;

        for(int i=0; i<qtd; i++) {
            nome = teclado.next();
            listaNomes.add(nome);
        }

        /*
        for(int i=listaNomes.size()-1;i>=0;i--) {
            System.out.println(listaNomes.get(i));
        }
        */

        System.out.println("Ordem normal: ");
        System.out.println(listaNomes);

        Collections.reverse(listaNomes);

        System.out.println("Ordem reversa");
        System.out.println(listaNomes);

    }
}

//primitives
/*
int
float
double
char letra = 'd';
 */