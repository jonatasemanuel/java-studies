package polimorfismo;

public class Gato implements Animal{

    @Override
    public void emitirSom() {
        System.out.println("Miauuu");
    }
    @Override
    public void dormir() {
        System.out.println("zZzzZZzZzz");
    }
}
