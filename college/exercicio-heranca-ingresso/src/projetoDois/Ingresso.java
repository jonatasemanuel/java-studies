package projetoDois;

public class Ingresso {
    public String nomeEvento;
    public double valor;

    public Ingresso (String nomeEvento, double valor){
        this.nomeEvento = nomeEvento;
        this.valor = valor;
    }
    public void info(){
        System.out.println("Event: " + this.nomeEvento);
        System.out.println("R$" + this.valor);
    }
}
