package classes;

public class Aluno {
    int matricula;
    String nome;
    String cpf;

    Aluno(){
        // podemos usar para passar um log toda vez que for instanciado
    }
    Aluno(int matricula, String nome, String cpf){
        this.matricula = matricula;
        this.nome = nome;
        this.cpf = cpf;
    }

    void info() {
        System.out.println("Matricula: " + matricula);
        System.out.println("CPF: " + cpf);
        System.out.println("Nome: " + nome);
    }

}
