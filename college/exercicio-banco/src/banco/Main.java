package banco;

public class Main {
    public static void main(String[] args) {

        Conta techJow = new Conta("Emanuel", 78645, 677);
        Conta joe = new Conta("Jonatas", 500, 300);
        joe.info();
        joe.sacar(345);

    }
}