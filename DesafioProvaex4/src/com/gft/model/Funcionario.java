package com.gft.model;

public abstract class Funcionario {
	private String nome;
	private int idade;
	private double salario;

//	Construtores
	public Funcionario() {

	}

	public Funcionario(String nome, int idade, double salario) {
		this.nome = nome;
		this.idade = idade;
		this.salario = salario;
	}

//	Getters e Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double Bonificacao() {
		return salario;
	}
}
