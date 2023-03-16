package notas;

public class Curso {
    private String nome;
    private double mensalidade;

    public Curso (String nome, double mensalidade) {
        this.nome = nome;
        this.mensalidade = mensalidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setMensalidade(double mensalidade) {
        this.mensalidade = mensalidade;
    }
    public String getNome() {
        return nome;
    }
    public double getMensalidade() {
        return mensalidade;
    }

    public void info(){
        System.out.println("Curso: " + nome);
        System.out.println("Mensalidade: R$" + mensalidade);
    }
}
