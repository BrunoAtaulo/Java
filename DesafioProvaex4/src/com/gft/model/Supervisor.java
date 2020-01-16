package com.gft.model;

public class Supervisor extends Funcionario{

	public Supervisor() {
	}

	public Supervisor(String nome, int idade, double salario) {
		super(nome, idade, salario);
	}

	@Override
	public double Bonificacao() {
		return getSalario() + 5000;
	}
}
