package cursojava.classes;

public class Diretor extends Pessoa{

	private long registroEducacao;
	private int tempoDirecao;
	private String titulacao;
	public long getRegistroEducacao() {
		return registroEducacao;
	}
	public void setRegistroEducacao(long registroEducacao) {
		this.registroEducacao = registroEducacao;
	}
	public int getTempoDirecao() {
		return tempoDirecao;
	}
	public void setTempoDirecao(int tempoDirecao) {
		this.tempoDirecao = tempoDirecao;
	}
	public String getTitulacao() {
		return titulacao;
	}
	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}
	@Override
	public String toString() {
		return "Diretor [registroEducacao=" + registroEducacao + ", tempoDirecao=" + tempoDirecao + ", titulacao="
				+ titulacao + ", getNome()=" + getNome() + ", getIdade()=" + getIdade() + ", getDataNascimento()="
				+ getDataNascimento() + ", getRegistroGeral()=" + getRegistroGeral() + ", getNumeroCpf()="
				+ getNumeroCpf() + ", getNomeMae()=" + getNomeMae() + ", getNomePai()=" + getNomePai() + "]";
	}
	@Override
	public double sarario() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}
