public class Disciplina {
    private String nome;
    private int carga_horaria;
    private String codigo_disciplina;
    private String codigo_departamento;
    private String codigo = codigo_departamento+codigo_disciplina;
    private String horario;
    private String ementa;

    public Disciplina(String nome){
        this.nome = nome;
    }
    public void setEmenta(String ementa){ //descrição da ementa de uma disciplina.
        this.ementa = ementa;
    };
    public String getEmenta(){
        return this.ementa;
    }

    public void setHorarioAula(String horario){
        this.horario = horario;
    };
    public String getHorarioAula(){ //obtenção do horário de uma aula.
        return this.horario;
    };

    public String getNome(){
        return this.nome;
    }
    public void setCarga_horaria(int ch){
        this.carga_horaria = ch;
    }
    public int getCarga_horaria(){
        return this.carga_horaria;
    }
}
