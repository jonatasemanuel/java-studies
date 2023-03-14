package banco;

public class Conta {
    String correntista;
    float saldo;
    float limiteSaque;


    Conta(String correntista, float saldo, float limiteSaque) {
        this.correntista = correntista;
        this.saldo = saldo;
        this.limiteSaque = limiteSaque;
    }

    public double transferir(String Conta, float valor) {
        double sub = Conta.saldo;
        return
    }
    public void sacar(float valor){
//        float sub = saldo - valor;
        if (valor <=limiteSaque){
            System.out.println("Saldo atual: " + saldo);
            System.out.println("Sacando: " + valor);
        }
        else {
            System.out.println("Limite de saque excedido!");
        }
    }

    public void depositar(float valor) {
        System.out.println("Depositando: " + valor);
        System.out.println("Total: " + (saldo+valor));
    }

    public void info(){
        System.out.println("Saldo atual: R$" + saldo);
    }
}