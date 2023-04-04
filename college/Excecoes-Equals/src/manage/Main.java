package manage;

public class Main {
    public static void main(String[] args) {
        Usuario u1 = new Usuario(112, "Mariô", "122-212-212/34");
        Usuario u2 = new Usuario(112, "Mariô", "122-212-212/34");

        System.out.println(u1 == u2);
//        System.out.println(s1 == s3);
        System.out.println(u1.equals(u2));
    }
}