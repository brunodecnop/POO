import java.util.ArrayList;

public class Aluno {
    private String nome;
    private float ch_acumulada;
    private float notas_acumuladas;
    private ArrayList<String> historico = new ArrayList();
    private ArrayList<Float> medias = new ArrayList();

    public Aluno(String nome){
        this.nome = nome;
    }

    public void calculaCR(Disciplina disciplina, float nota){ //cálculo do CR de um aluno.
        this.notas_acumuladas += disciplina.getCarga_horaria()*nota;
        this.ch_acumulada += disciplina.getCarga_horaria();
    }
    public float getCR(){
        return this.notas_acumuladas/this.ch_acumulada;
    }

    public void AddHistorico(Disciplina disciplina, float nota){
        String nota_add_historico = disciplina.getNome()+": "+nota;
        this.historico.add(nota_add_historico);
    };

    public ArrayList<String> getHistorico(){ //exibição do histórico do aluno.
        return this.historico;
    }

    public void setMedias(float media) {
        this.medias.add(media);
    }
}
