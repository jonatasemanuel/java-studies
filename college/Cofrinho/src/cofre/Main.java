package cofre;

public class Main {
    public static void main(String[] args) {

        Cofrinho cofre = new Cofrinho();
        cofre.adionar(new Moeda("Euro", 0.5));
        cofre.adionar(new Moeda("Euro", 2));
        cofre.adionar(new Moeda("Euro", 1));
        cofre.adionar(new Moeda("Euro", 10));

        System.out.println("Total do cofrinho: " + cofre.calcularTotal());
    }
}