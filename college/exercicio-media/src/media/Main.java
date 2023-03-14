package media;

public class Main {
    public static void main(String[] args) {
        Media mediaArit = new Media(8, 8, 10);
        System.out.println("Media aritmetica: "+mediaArit.mediaAritmetica());
        System.out.println("Media ponderada: "+mediaArit.mediaPonterada());
    }
}