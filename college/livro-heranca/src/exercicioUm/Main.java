package exercicioUm;

public class Main {
    public static void main(String[] args) {
        Autor luciano = new Autor("Luciano Ramalho","fluent@python.com", "Brasileiro");
//        luciano.info();
        LivroFisico fluent = new LivroFisico("Fluent Python", luciano, "Technology",
                2, 24, 2500);
        fluent.info();
        LivroDigital python = new LivroDigital("Fluent Python", luciano, "Technology", 2, 5645, 54);
        python.info();
    }
}