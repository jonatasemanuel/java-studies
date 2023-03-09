package classes;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Instaciamento
        Aluno maria = new Aluno();
        maria.matricula = 1002;
        maria.cpf = "12231453";
        maria.nome = "Maria";

        // Usando construtor
        Aluno joao = new Aluno(107, "845784545", "Joao");


//        maria.info();
//        maria.nome = "Maria Silva";
        maria.info();
        joao.info();
        // Arrays

        ArrayList<Aluno> alunos = new ArrayList<>(); // criei a lista alunos

        alunos.add(maria); // adicionando aluno ja criado
        alunos.add(new Aluno(1004, "Mario Kart", "3423523443")); // criando ja intanciando o aluno

        for (Aluno n : alunos) {
            System.out.println(n.nome);
        }

//        Interacao entre objetos

//        Turma turmaUm = new Turma();

//        turmaUm.prof = new Professor();
//        turmaUm.prof.nome="O professor";
//        turmaUm.alunos = new ArrayList<Aluno>();
//        turmaUm.alunos.add(new Aluno());
//        turmaUm.alunos.get(0).nome="Maria";


//        Carro relampago = new Carro();
//        System.out.println(Carro.milhasParaMetodos(10));
//        System.out.println(Carro.PI);
    }
}