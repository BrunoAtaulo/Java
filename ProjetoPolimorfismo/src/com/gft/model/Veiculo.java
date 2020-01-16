package com.gft.model;

public abstract class Veiculo {
	protected String marca;
	protected String modelo;
	protected String placa;
	protected String cor;
	protected float km;
	protected boolean isLigado;
	protected int litrosCombustivel;
	protected int velocidade;
	protected double preco;

//	Construtor
	
	public Veiculo() {
		
	}
	
	public Veiculo(String marca, String modelo, String placa, String cor, float km, boolean isLigado, int litrosCombustivel,
			int velocidade, double preco) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.placa = placa;
		this.cor = cor;
		this.km = km;
		this.isLigado = isLigado;
		this.litrosCombustivel = litrosCombustivel;
		this.velocidade = velocidade;
		this.preco = preco;
	}
	
	
	// Getters e Setters
	public String getmarca() {
		return marca;
	}

	public void setmarca(String marca) {
		this.marca = marca;
	}

	public String getmodelo() {
		return modelo;
	}

	public void setmodelo(String modelo) {
		this.modelo = modelo;
	}

	public String getplaca() {
		return placa;
	}

	public void setplaca(String placa) {
		this.placa = placa;
	}

	public String getcor() {
		return cor;
	}

	public void setcor(String cor) {
		this.cor = cor;
	}

	public float getkm() {
		return km;
	}

	public void setkm(float km) {
		this.km = km;
	}

	public boolean getisLigado() {
		return isLigado;
	}

	public void setisLigado(boolean isLigado) {
		this.isLigado = isLigado;
	}

	public int getlitrosCombustivel() {
		return litrosCombustivel;
	}

	public void setlitrosCombustivel(int litrosCombustivel) {
		this.litrosCombustivel = litrosCombustivel;
	}

	public int getvelocidade() {
		return velocidade;
	}

	public void setvelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public double getpreco() {
		return preco;
	}

	public void setpreco(double preco) {
		this.preco = preco;
	}

	// Métodos
	public boolean ligar() {
		if (this.isLigado == false) {
			this.isLigado = true;
			System.out.println("Veiculo ligado\n");
			return true;
		} else {
			System.out.println("veiculo já está ligado, não pode ligar um veiculo ligado\n");
			return false;
		}
	}

	public void desligar() {
		if (this.isLigado == false) {
			System.out.println("Veiculo já estava desligado\n");
		} else {
			this.isLigado = false;
			System.out.println("Veiculo desligado\n");
		}
	}

	public void acelerar() {
		if (this.isLigado && this.litrosCombustivel >= 1) {
			if(this.velocidade <= 160) {
				this.velocidade += 20;
				this.litrosCombustivel -= 1;
				System.out.println("Veiculo acelerado em 20km\nVelocidade atual: " + velocidade + " km/h\n");
			}else {
				System.out.println("Não pode acelerar mais que 180 km/h\n");
			}
		} else {
			if (this.isLigado == false) {
				System.out.println("Não é possivel acelerar um veículo desligado, favor ligar\n");
			} else {
				this.velocidade = 0;
				System.out.println("Veiculo sem combustível, favor abastecer\n");
			}
		}
	}

	public void frear() {
		if (this.isLigado == true && this.velocidade > 0) {
			this.velocidade-= 10;
			System.out.println("Veículo reduziu a velocidade em 10 km\nVelocidade atual: " + velocidade + " km/h\n");
		} else {
			System.out.println("Não é possivel frear um veiculo parado");
		}
	}

	public void abastecer(int qtd) {
		if (this.litrosCombustivel == 100) {
			System.out.println("Não pode abastecer pois está com o tanque cheio (100L)\n");

		} else {
			if (this.litrosCombustivel + qtd > 100) {
				System.out.println("Não é possível abastecer com esta quantidade de combustivel pois fica acima do "
						+ " máximo permitido\n");
			} else {
				this.velocidade = 0;
				this.litrosCombustivel += qtd;
				System.out
						.println("Veiculo abastecido\nQuantidade atual de combustivel no tanque: " + litrosCombustivel);
			}
		}
	}

	public void pintar(String corcarro) {
		System.out.println("Veiculo pintado na cor " + corcarro + "\n");
	}
	
}