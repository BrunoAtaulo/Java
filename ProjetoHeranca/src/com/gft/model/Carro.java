package com.gft.model;

public class Carro extends Veiculo{
	private String marca;
	private int portas;
	private int ano;

	public Carro() {
		
	}
	
	public Carro(String modelo, double velocidade, int passageiros, double combustivel) {
		super(modelo, velocidade, passageiros, combustivel);
	}

	//	Getters e Setters
//	marca
	public String getmarca() {
		return marca;
	}
	
	public void setmarca(String marca) {
		this.marca = marca;
	}
	
//	portas
	public int getportas() {
		return portas;
	}
	public void setportas(int portas) {
		this.portas = portas;
	}
	
//	ano
	public int getano() {
		return ano;
	}
	
	public void setano(int ano) {
		this.ano = ano;
	}
	
}