package biAtlet;

public class AtletaTeste {

	public static void main(String[] args) {
		
		BiAtleta atleta1 = new BiAtleta("Esley",61);
		
		System.out.println("Nome: " + atleta1.getNome());
        System.out.println("Peso: " + atleta1.getPeso());
		
		atleta1.correr();
		atleta1.pedalar();
	}

}
