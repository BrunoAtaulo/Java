package com.gft.model;

public class Aviao extends Veiculo{
	private String tipo;
	private String uso;
	
	
	public Aviao() {
	}


	public Aviao(String modelo, double velocidade, int passageiros, double combustivel, String tipo, String uso) {
		super(modelo, velocidade, passageiros, combustivel);
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
