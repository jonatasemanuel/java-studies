package notas;

public class Aluno {
    private String nome;
    private int matricula;
    private double desconto;
    private Curso curso;

    public Aluno(String nome, int matricula, double desconto, Curso curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.desconto = desconto;
        this.curso = curso;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setDesconto (double desconto) {
        this.desconto = desconto;
    }

    public void setCurso (Curso curso) {
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public double getDesconto() {
        return desconto;
    }

    public Curso getCurso() {
        return curso;
    }

    public void info() {
        System.out.println("Nome: " + nome);
        System.out.println("Matricula: " + matricula);
        curso.info();
        System.out.println("Desconto: " + desconto);
        System.out.println("Total a pagar R$" + pagamento());
//        System.out.println("Curso: " + curso.getNome());
    }

    public double pagamento() {
        return curso.getMensalidade()*(1-desconto);
    }
}

