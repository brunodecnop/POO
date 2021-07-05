public class Main_ex3 {
    public static void main(String[] args) {

        Disciplina Matemática = new Disciplina("Matemática");
        Matemática.setCarga_horaria(68);

        Disciplina Geografia = new Disciplina("Geografia");
        Geografia.setCarga_horaria(68);

        Disciplina História = new Disciplina("História");
        História.setCarga_horaria(68);
        História.setHorarioAula("16:00h");
        System.out.println("Horário da aula de história: "+História.getHorarioAula());

        Aluno Thomaz = new Aluno("Thomaz");
        Thomaz.AddHistorico(Matemática, 10);
        Thomaz.AddHistorico(Geografia, 8);
        Thomaz.AddHistorico(História, 9);

        System.out.print("Histórico Thomaz: ");
        System.out.println(Thomaz.getHistorico());

        System.out.print("CR Thomz: ");
        Thomaz.calculaCR(Matemática, 10);
        Thomaz.calculaCR(Geografia, 8);
        Thomaz.calculaCR(História, 9);
        System.out.println(Thomaz.getCR());

        Turma turma1 = new Turma(20);
        turma1.setMedia_da_turma(8);
        turma1.setMedia_aluno(Thomaz, 6);
        System.out.print("Média de Thomaz em relação ao resto da turma: ");
        System.out.println(turma1.getMediaDoAlunoNaTurma(Thomaz));

        Disciplina Arquiteturas_de_comp = new Disciplina("Arquiteturas de Computadores");
        System.out.print("Ementa de Arquiteturas de Computadores: ");
        Arquiteturas_de_comp.setEmenta("*bastante coisa*");
        System.out.println(Arquiteturas_de_comp.getEmenta());
    }
}
