public class Turma {
    private int quantidade_de_alunos;
    private float media_da_turma;
    private float media_aluno;
    private String codigo;
    public Turma(int quantidade_de_alunos){
        this.quantidade_de_alunos = quantidade_de_alunos;
    }
    public float getMediaDoAlunoNaTurma(Aluno aluno){ //media do aluno em relação ao resto da turma;
        return 10*this.getMedia_aluno()/getMedia_da_turma();
    };
    public void setMedia_da_turma(float media_da_turma){
        this.media_da_turma = media_da_turma;
    }
    public void setMedia_aluno(Aluno aluno, float media_aluno){
        aluno.setMedias(media_aluno);
        this.media_aluno = media_aluno;
    }
    public float getMedia_aluno(){
        return this.media_aluno;
    }
    public float getMedia_da_turma(){
      return this.media_da_turma;
    };
}
