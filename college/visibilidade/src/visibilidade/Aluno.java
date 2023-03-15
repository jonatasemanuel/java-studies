package visibilidade;

public class Aluno {
    private int matricula;
    String nome;
    String cpf;
    protected int notas[];

    Aluno(){
        // podemos usar para passar um log toda vez que for instanciado
    }
    public Aluno(int matricula, String nome, String cpf){
        this.matricula = matricula;
        this.nome = nome;
        this.cpf = cpf;
    }

    public void info() {
        System.out.println("Matricula: " + matricula);
        System.out.println("CPF: " + cpf);
        System.out.println("Nome: " + nome);
    }
}
