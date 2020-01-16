package com.gft.Desafio04.model;

import com.gft.Desafio04.interfaces.Imposto;

public class VideoGame extends Produto implements Imposto{
	protected String marca;
	protected String modelo;
	protected boolean isUsado;

	//	Contrutor
	public VideoGame() {
	}

	public VideoGame(String nome, double preco, int qtd, String marca, String modelo, boolean isUsado) {
		super(nome, preco, qtd);
		this.marca = marca;
		this.modelo = modelo;
		this.isUsado = isUsado;
	}


	// Getters e Setters
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public boolean isUsado() {
		return isUsado;
	}

	public void setUsado(boolean isUsado) {
		this.isUsado = isUsado;
	}

	@Override
	public double calculaImposto() {
		double imp;
		if(this.isUsado == true) {
			imp = preco*0.25;
			//preco = preco + imp;
			System.out.println("Imposto " + nome + " usado, " + imp);
			return imp;	
		}else {
			imp = preco*0.45;
			//preco = preco + imp;
			System.out.println("Imposto " + nome + ", " + imp);
			return imp;	
		}
		
	}
	
}