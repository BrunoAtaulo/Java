package com.gft.model;

public class Caminhao extends Veiculo {
	float peso;

	public Caminhao() {
		
	}
	
	public Caminhao(String marca, String modelo, String placa, String cor, float km, boolean isLigado,
			int litrosCombustivel, int velocidade, double preco, float peso) {
		super(marca, modelo, placa, cor, km, isLigado, litrosCombustivel, velocidade, preco);
		this.peso = peso;
	}

//	Getters e Setters
	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

}
