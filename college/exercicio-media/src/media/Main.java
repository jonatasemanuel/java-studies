package media;

public class Main {
    public static void main(String[] args) {
//        Media mediaArit = new Media(8, 8, 10);
//        System.out.println("Media aritmetica: "+mediaArit.mediaAritmetica());
//        System.out.println("Media ponderada: "+mediaArit.mediaPonterada());
        Aluno a1 = new Aluno("Jonatas", "SWE", new Media(9, 10, 4));
        Aluno a2 = new Aluno("Denilson", "ADS", new Media(3, 10, 8));

        a1.info();
        a2.info();


    }
}