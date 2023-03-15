package notas;

public class Main {
    public static void main(String[] args) {

//        Nota mario = new Nota(9, 55,7);
//        mario.setNota2(8);
//        mario.resultado();
        Aluno mario = new Aluno("Mario", 234, 0.1, new Curso("Engenharia", 547));
        mario.info();
    }
}