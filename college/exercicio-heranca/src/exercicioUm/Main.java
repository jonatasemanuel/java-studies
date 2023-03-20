package exercicioUm;

public class Main {
    public static void main(String[] args) {
        Autor luciano = new Autor("Luciano Ramalho","fluent@python.com", "Brasileiro");
//        luciano.info();
//        Livro fluent = new Livro("Fluent Python", luciano, "Technology", 2);
//        fluent.info();
        LivroDigital python = new LivroDigital("Fluent Python", luciano, "Technology", 2, 5645, 54);
        python.info();
    }
}