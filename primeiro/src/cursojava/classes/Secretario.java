package cursojava.classes;

public class Secretario extends Pessoa{
	
	private long registro;
	private int nivelCargo;
	private int experiencia;
	public long getRegistro() {
		return registro;
	}
	public void setRegistro(long registro) {
		this.registro = registro;
	}
	public int getNivelCargo() {
		return nivelCargo;
	}
	public void setNivelCargo(int nivelCargo) {
		this.nivelCargo = nivelCargo;
	}
	public int getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}
	@Override
	public String toString() {
		return "Secretario [registro=" + registro + ", nivelCargo=" + nivelCargo + ", experiencia=" + experiencia
				+ ", getNome()=" + getNome() + ", getIdade()=" + getIdade() + ", getDataNascimento()="
				+ getDataNascimento() + ", getRegistroGeral()=" + getRegistroGeral() + ", getNumeroCpf()="
				+ getNumeroCpf() + ", getNomeMae()=" + getNomeMae() + ", getNomePai()=" + getNomePai() + "]";
	}
	@Override
	public double sarario() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
