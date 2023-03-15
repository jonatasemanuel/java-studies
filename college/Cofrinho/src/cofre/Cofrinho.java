package cofre;


import java.util.ArrayList;

public class Cofrinho {
    ArrayList<Moeda> moedas = new ArrayList<>();

    public void adionar(Moeda moeda){
        moedas.add(moeda);
    }

    public double calcularTotal(){
        double total = 0;
        for (Moeda moeda : moedas ) {
            total += moeda.getValor();
        }
        return total;
    }
}
