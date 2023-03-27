package impressao;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Funcionario f = new Funcionario("Mario", "111.111.111-76");
        Carro c = new Carro("Celta", "Preto", 2);
        Quadrado q = new Quadrado(10);

        ArrayList<Imprimivel> lista = new ArrayList<>();
        lista.add(f);
        lista.add(c);
        lista.add(q);

        Imprimivel i = f;
        i.imprimir();
        i = c;
        i.imprimir();
        i = q;
        i.imprimir();
    }
}