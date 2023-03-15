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

    public void transferir(Conta conta ,float valor) {
        if (valor < saldo) {
            saldo -= valor;
            conta.saldo += valor;
        }
    }
     boolean sacar(float valor){
//        float sub = saldo - valor;
        if (valor <=limiteSaque && saldo > valor){
            saldo -= valor;
            System.out.println("Sacando: " + valor);
            return true;
        }
        else {
            return false;
        }
    }

    boolean depositar(float valor) {
        if (valor <= 0) {
            return false;
        }
        System.out.println("Depositando: " + valor);
        saldo += valor;
        return true;
    }

    public void info(){
        System.out.println("Nome: " + correntista);
        System.out.println("Saldo atual: R$" + saldo);
    }
}