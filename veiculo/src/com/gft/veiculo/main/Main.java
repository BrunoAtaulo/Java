package com.gft.veiculo.main;

import com.gft.veiculo.model.Veiculo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int opcao, qtdlitros;
		String corcarro;
		
		Veiculo carro = new Veiculo();
		Scanner tc = new Scanner(System.in);
		

		do {
		System.out.println("\nDigite a opção desejada:\n1) Ligar carro\n2) Desligar carro\n3) Acelerar\n4) Frear\n5) Abastecer\n"
				+ "6) Pintar carro\n7) Sair\n");
		opcao = tc.nextInt();

		switch (opcao) {
		case 1:
//			Ligar carro
			carro.ligar();
			break;
		case 2:
//			Desligar carro
			carro.desligar();
			break;
		case 3:
//			Acelerar carro	
			carro.acelerar();
			break;
		case 4:
//			Frear carro
			carro.frear();
			break;
		case 5:
//			Abastecer carro
			System.out.println("Quantos litros deseja abastecer?");
			qtdlitros = tc.nextInt();
			carro.abastecer(qtdlitros);
			break;
		case 6:
//			Pintar carro
			System.out.println("Digite a cor desejada");
			corcarro = tc.next();
			carro.pintar(corcarro);
			break;
		case 7:
//			Sair
			break;

		default:
			System.out.println("Opcao invalida\n");
		}

		} while (opcao !=7);
	}

}
