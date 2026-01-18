package Trabalho;

public class Main {
    public static void main(String[] args) {

        Disciplina d1 = new Disciplina("P358", "POO", 1);
        Disciplina d2 = new Disciplina("R255", "RLA", 1);
        Disciplina d3 = new Disciplina("S305", "SO", 2);

        
        Aluno aluno1 = new Regular("Luiz", "98765432101", 20, "A2124");
        Aluno aluno2 = new Regular("Cíntia", "68100587125", 24, "A1422");
        Aluno aluno3 = new Bolsista("Gabriel", "01234567890", 21, "A3243");

        Professor p1 = new Professor("Andre", "9846510078453", 45, "Tecnologia");

        Visitante v1 = new Visitante("Lucas", "8940354876", 32);
        Visitante v2 = new Visitante("Pedro", "0002157489", 55);
       
        Turma t1 = new Turma();
        t1.professor = p1;
        t1.disciplina = d1;
        t1.adicionarAluno(aluno1);
        t1.adicionarAluno(aluno2);
        t1.adicionarAluno(aluno3);

        Turma t2 = new Turma();
        t2.professor = p1;
        t2.disciplina = d2;
        t2.adicionarAluno(aluno1);
        t2.adicionarAluno(aluno2);
        t2.adicionarAluno(aluno3);

        Turma t3 = new Turma();
        t3.professor = p1;
        t3.disciplina = d3;
        t3.adicionarAluno(aluno1);
        t3.adicionarAluno(aluno2);
        t3.adicionarAluno(aluno3);

        System.out.println("--------------------------");
        System.out.println("Turma 1");
        System.out.println("Codigo: " + d1.codigo);
        System.out.println(p1);
        System.out.println(d1);
        System.out.println("Alunos:");
        t1.listarAluno();

        System.out.println("--------------------------");
        System.out.println("Turma 2");
        System.out.println("Codigo: " + d2.codigo);
        System.out.println(p1);
        System.out.println(d2);
        System.out.println("Alunos:");
        t2.listarAluno();

        System.out.println("--------------------------");
        System.out.println("Turma 3");
        System.out.println("Codigo: " + d3.codigo);
        System.out.println(p1);
        System.out.println(d3);
        System.out.println("Alunos:");
        t3.listarAluno();
        

    }
}

