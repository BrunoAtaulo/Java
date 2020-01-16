package com.gft.model;

public class Vendedor extends Funcionario{

	
	public Vendedor() {
	}

	public Vendedor(String nome, int idade, double salario) {
		super(nome, idade, salario);
	}

	@Override
	public double Bonificacao() {
		return getSalario() + 3000;
	}
}
