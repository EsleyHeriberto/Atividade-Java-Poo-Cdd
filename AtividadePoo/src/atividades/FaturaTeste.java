package atividades;

public class FaturaTeste {

	public static void main(String[] args) {
		
		fatura f1 = new fatura("0001","teclado",2,25);
		
		System.out.printf("O número é %s, o nome do item é %s, na quantidade de %d e no valor de %.2f, O TOTAL É %.2f",
				f1.getNumero(),f1.getDescricao(),f1.getQuantComprada(),f1.getPrecoItem(),f1.getTotalFatura());
		
		System.out.println();
		
		fatura f2 = new fatura("0002","fone",-5,-25);
		
		System.out.printf("O número é %s, o nome do item é %s, na quantidade de %d e no valor de %.2f, O TOTAL É %.2f",
				f2.getNumero(),f2.getDescricao(),f2.getQuantComprada(),f2.getPrecoItem(),f2.getTotalFatura());
		
	}

}
