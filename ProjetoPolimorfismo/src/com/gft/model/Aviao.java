package com.gft.model;

public class Aviao extends Veiculo{
	private String tipo;
	private String uso;
	
//	Construtor
	public Aviao() {
		
	}
	
	public Aviao(String marca, String modelo, String placa, String cor, float km, boolean isLigado,
			int litrosCombustivel, int velocidade, double preco, String tipo, String uso) {
		super(marca, modelo, placa, cor, km, isLigado, litrosCombustivel, velocidade, preco);
		this.tipo = tipo;
		this.uso = uso;
	}
//	Getters e Setters
//	tipo
	public String gettipo() {
		return tipo;
	}
	public void settipo(String tipo) {
		this.tipo = tipo;
	}
	
//	uso
	public String getuso() {
		return uso;
	}

	public void setuso(String uso) {
		this.uso = uso;
	}
	
	
}
