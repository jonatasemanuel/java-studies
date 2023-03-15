package media;

public class Aluno {
    String nome, curso;
    Media notas;

    Aluno(String nome, String curso, Media notas) {
        this.nome = nome;
        this.curso = curso;
        this.notas = notas;
    }

    void info(){
        System.out.println("Nome: " + nome);
        System.out.println("Curso: " + curso);
        System.out.println("Media A: " + notas.mediaAritmetica());
        System.out.println("Media P: " + notas.mediaPonterada());
    }
}
