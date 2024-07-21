package atividades;

public class fatura {

	private String numero;
	private String descricao;
	private int quantComprada;
	private double precoItem;
	
	
	public fatura(String numero, String descricao, int quantComprada, double precoItem) {
		this.numero = numero;
		this.descricao = descricao;
		setQuantComprada(quantComprada);
        setPrecoItem(precoItem);
		
	}

	
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	
	public int getQuantComprada() {
		return quantComprada;
	}

	public void setQuantComprada(int quantComprada) {
		if(quantComprada < 0) {
			this.quantComprada = 0;
		} else {
			this.quantComprada = quantComprada;
			
		}	
	}

	
	public double getPrecoItem() {
		return precoItem;
	}

	public void setPrecoItem(double precoItem) {
		if(precoItem < 0) {
			this.precoItem = 0.0;
		} else {
			this.precoItem = precoItem;			
		}
		
	}
	
	
	public double getTotalFatura() {
		return quantComprada * precoItem;
	}
	
	
}
