package com.gft.model;

public class Carro extends Veiculo{
	private String marca;
	private int portas;
	private int ano;
	
	public Carro() {
		
	}
	
	public Carro(String marca, String modelo, String placa, String cor, float km, boolean isLigado,
			int litrosCombustivel, int velocidade, double preco, String marca2, int portas, int ano) {
		super(marca, modelo, placa, cor, km, isLigado, litrosCombustivel, velocidade, preco);
		marca = marca2;
		this.portas = portas;
		this.ano = ano;
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
	
	
	
	
//	Métodos
	
	public void abastecer(int qtd) {
		if (this.getisLigado()) {
			System.out.println("Favor desligar o carro para poder abastecer");
		}else if(this.getlitrosCombustivel() == 100){
			System.out.println("Não pode abastecer um carro com tanque cheio (100L)\n");
			System.out.println("Digite a quantidade de combustivel");
		}
		else if (getlitrosCombustivel() + qtd > 100) {
			System.out.println("Não é possível abastecer com esta quantidade de combustível pois fica acima do permitido\n");
		}else {
			this.setvelocidade(0);
//			Tem que alterar para get e tentar fazer um get com set no mesmo comando
			this.setlitrosCombustivel(litrosCombustivel+=qtd);
		}
		
	}
}