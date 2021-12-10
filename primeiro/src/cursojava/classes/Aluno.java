package cursojava.classes;

import cursojava.constantes.StatusAluno;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Aluno {
   private String nome;
   private int idade;
   private String dataNascimento;
   private String registroGeral;
   private String numeroCpf;
   private String nomeMae;
   private String nomePai;
   private String dataMatricula;
   private String nomeEscola;

    List <Disciplina> disciplinas = new ArrayList<>();

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    private String serieMatriculado;

    public Aluno(){
    }

    public Aluno(String nome) {
        this.nome = nome;
    }

    public Aluno(String nome, int idade, String dataNascimento, String registroGeral,
                 String numeroCpf, String nomeMae, String nomePai, String dataMatricula,
                 String nomeEscola, String serieMatriculado) {
        this.nome = nome;
        this.idade = idade;
        this.dataNascimento = dataNascimento;
        this.registroGeral = registroGeral;
        this.numeroCpf = numeroCpf;
        this.nomeMae = nomeMae;
        this.nomePai = nomePai;
        this.dataMatricula = dataMatricula;
        this.nomeEscola = nomeEscola;
        this.serieMatriculado = serieMatriculado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getRegistroGeral() {
        return registroGeral;
    }

    public void setRegistroGeral(String registroGeral) {
        this.registroGeral = registroGeral;
    }

    public String getNumeroCpf() {
        return numeroCpf;
    }

    public void setNumeroCpf(String numeroCpf) {
        this.numeroCpf = numeroCpf;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public String getNomeEscola() {
        return nomeEscola;
    }

    public void setNomeEscola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
    }

    public String getSerieMatriculado() {
        return serieMatriculado;
    }

    public void setSerieMatriculado(String serieMatriculado) {
        this.serieMatriculado = serieMatriculado;
    }

    public double getMediaNota(){
        double somaNota = 0.0;
        for (Disciplina disciplina: disciplinas) {
            somaNota += disciplina.getNota();
        }
        return somaNota / disciplinas.size();
    }


    public boolean getAlunoAprovado(){
        double media = this.getMediaNota();
        if (media >= 7){
            return true;
        }else{
              return false;
        }
    }

    public String getAlunoAprovado2(){
        double media = this.getMediaNota();
        if (media >= 5){
            if (media >=7) {
                return StatusAluno.APROVADO;
            }else{
                return StatusAluno.RECUPERACAO;
            }
        }else{
            return StatusAluno.REPROVADO;
        }
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", registroGeral='" + registroGeral + '\'' +
                ", numeroCpf='" + numeroCpf + '\'' +
                ", nomeMae='" + nomeMae + '\'' +
                ", nomePai='" + nomePai + '\'' +
                ", dataMatricula='" + dataMatricula + '\'' +
                ", nomeEscola='" + nomeEscola + '\'' +
                ", serieMatriculado='" + serieMatriculado + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return idade == aluno.idade &&
                Objects.equals(nome, aluno.nome) &&
                Objects.equals(dataNascimento, aluno.dataNascimento) &&
                Objects.equals(registroGeral, aluno.registroGeral) &&
                Objects.equals(numeroCpf, aluno.numeroCpf) &&
                Objects.equals(nomeMae, aluno.nomeMae) &&
                Objects.equals(nomePai, aluno.nomePai) &&
                Objects.equals(dataMatricula, aluno.dataMatricula) &&
                Objects.equals(nomeEscola, aluno.nomeEscola) &&
                Objects.equals(serieMatriculado, aluno.serieMatriculado);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, idade, dataNascimento, registroGeral,
                numeroCpf, nomeMae, nomePai, dataMatricula, nomeEscola,
                serieMatriculado);
    }
}
