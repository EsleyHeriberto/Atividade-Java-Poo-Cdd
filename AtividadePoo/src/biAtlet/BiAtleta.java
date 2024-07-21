package biAtlet;

public class BiAtleta implements Ciclista,Corredor{

	private String nome;
	private double peso;
	
	public BiAtleta(String nome,double peso) {
		this.nome = nome;
		this.peso = peso;
	}
	
	@Override
	public String getNome() {
		return nome;
	}

	@Override
	public double getPeso() {
		return peso;
	}

	@Override
	public void correr() {
		System.out.println(nome + " está correndo.");
	}

	@Override
	public void pedalar() {
		System.out.println(nome + " está pedalando.");
	}

}
