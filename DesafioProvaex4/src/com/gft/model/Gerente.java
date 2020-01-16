package com.gft.model;

public class Gerente extends Funcionario {

	public Gerente() {
	}

	public Gerente(String nome, int idade, double salario) {
		super(nome, idade, salario);
	}
	
	@Override
	public double Bonificacao() {
		return getSalario() + 10000;
	}
	
	
	
}
