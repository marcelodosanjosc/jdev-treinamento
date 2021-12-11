package cursojava.classes;

import cursojava.constantes.StatusAluno;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Aluno extends Pessoa{
   
	
	private String dataMatricula;
	private String nomeEscola;
	private String serieMatricula;
	private List<Disciplina> disciplinas = new ArrayList<>();
	
	

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


	public String getSerieMatricula() {
		return serieMatricula;
	}


	public void setSerieMatricula(String serieMatricula) {
		this.serieMatricula = serieMatricula;
	}


	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}


	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	
	
	
	@Override
	public String toString() {
		return "Aluno [dataMatricula=" + dataMatricula + ", nomeEscola=" + nomeEscola + ", serieMatricula="
				+ serieMatricula + ", disciplinas=" + disciplinas + ", getNome()=" + getNome() + ", getIdade()="
				+ getIdade() + ", getDataNascimento()=" + getDataNascimento() + ", getRegistroGeral()="
				+ getRegistroGeral() + ", getNumeroCpf()=" + getNumeroCpf() + ", getNomeMae()=" + getNomeMae()
				+ ", getNomePai()=" + getNomePai() + "]";
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

    
}
