package banco;

public class Main {
    public static void main(String[] args) {

        Conta emanuel = new Conta("Emanuel", 0, 300);
        Conta joe = new Conta("Jonatas", 500, 300);
        joe.info();
        if(!joe.sacar(45346)){
            System.out.println("Saldo insuficiente ou limite excedido");
        }
        joe.depositar(23);
        emanuel.info();
        joe.transferir(emanuel, 45);
        joe.info();
        emanuel.info();
    }
}