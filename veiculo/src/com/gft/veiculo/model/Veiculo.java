package com.gft.veiculo.model;

public class Veiculo {
	private String marca;
	private String modelo;
	private String placa;
	private String cor;
	private float km;
	private boolean isLigado;
	private int litrosCombustivel;
	private int velocidade;
	private double preco;

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
			System.out.println("Carro ligado\n");
			return true;
		} else {
			System.out.println("Carro já está ligado, não pode ligar um carro ligado\n");
			return false;
		}
	}

	public void desligar() {
		if (this.isLigado == false) {
			System.out.println("Veiculo já estava desligado\n");
		} else {
			this.isLigado = false;
			System.out.println("Carro desligado\n");
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

	public void abastecer(int x) {
		if (this.litrosCombustivel == 100) {
			System.out.println("Não pode abastecer pois está com o tanque cheio (100L)\n");

		} else {
			if (this.litrosCombustivel + x > 100) {
				System.out.println("Não é possível abastecer com esta quantidade de combustivel pois fica acima do "
						+ " máximo permitido\n");
			} else {
				this.velocidade = 0;
				this.litrosCombustivel += x;
				System.out
						.println("Veiculo abastecido\nQuantidade atual de combustivel no tanque: " + litrosCombustivel);
			}
		}
	}

	public void pintar(String corcarro) {
		System.out.println("Veiculo pintado na cor " + corcarro + "\n");
	}
	
	
	
	
}