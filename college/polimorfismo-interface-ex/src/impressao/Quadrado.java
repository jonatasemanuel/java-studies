package impressao;

public class Quadrado implements Imprimivel{
    int medidaLado;

    public Quadrado(int medidaLado) {
        this.medidaLado = medidaLado;
    }

    @Override
    public void imprimir() {
        System.out.println("Quadrado");
        System.out.println("Lado: " + medidaLado);
        System.out.println("Area: " + (4* medidaLado));
        System.out.println("--- --- --- ---");
    }
}
