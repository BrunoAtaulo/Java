package com.gft.model;

public class Veiculo {
	private String modelo;
	private double velocidade;
	private int passageiros;
	private double combustivel;
	
	public Veiculo() {
		
	}


	public Veiculo(String modelo, double velocidade, int passageiros, double combustivel) {
		this.modelo = modelo;
		this.velocidade = velocidade;
		this.passageiros = passageiros;
		this.combustivel = combustivel;
	}

//	Getters e Setters
	
//	modelo
	public String getmodelo() {
		return modelo;
	}
	
	public void setmodelo(String modelo) {
		this.modelo = modelo;
	}

//	velocidade
	public double getvelocidade() {
		return velocidade;
	}
	
	public void setvelocidade(double velocidade) {
		this.velocidade = velocidade;
	}

//	passageiros
	public int getpassageiros() {
		return passageiros;
	}
	
	public void setpassageiros(int passageiros) {
		this.passageiros = passageiros;
	}
	
//	combustivel
	public double getcombustivel() {
		return combustivel;
	}
	
	public void setcombustivel(double combustivel) {
		this.combustivel = combustivel;
	}
}
