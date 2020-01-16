package com.gft.main;

import java.util.Scanner;

import com.gft.model.Aviao;
import com.gft.model.Carro;

public class Main {

	public static void main(String[] args) {

//		Carro carro1 = new Carro();
//		Aviao aviao1 = new Aviao();

		
		Carro carro1 = new Carro();
		Aviao aviao1 = new Aviao();		
		
		Scanner teclado = new Scanner(System.in);		

		String marcacarro,tipoaviao, gastarteclado, usoaviao;
		int opcao, opcaoaviao, opcaocarro, qtdportas, anocarro;

		System.out.println("Qual veiculo você deseja?\n1) Carro\n2) Aviao\nQualquer outro número: Sair");
		opcao = teclado.nextInt();

		do {

			if (opcao == 1) {
				System.out.println("Sobre o carro:\n1) Escolher marca do carro\n2) Escolher quantidade de portas do carro\n7) Sair");
				opcaocarro = teclado.nextInt();
				switch (opcaocarro) {
				case 1:
//					Marca do carro
					System.out.println("Digite a marca do carro: ");
					gastarteclado = teclado.nextLine();
					marcacarro = teclado.nextLine();
					carro1.setmarca(marcacarro);
					System.out.println("A marca do carro é: " + carro1.getmarca() + "\n");
					break;
				case 2:
					System.out.println("Digite o número de portas do carro: ");
					qtdportas = teclado.nextInt();
					System.out.println("A quantidade de portas do seu carro: " + qtdportas + "\n");
					break;
				case 3:
					System.out.println("Escolha o ano do seu carro: ");
					anocarro = teclado.nextInt();
					carro1.setano(anocarro);
					System.out.println("O ano do seu carro é: " + anocarro + "\n");
					break;
				case 7:
					System.out.println("Qual veiculo você deseja?\n1) Carro\n2) Aviao");
					opcao = teclado.nextInt();
					break;

				default:
					System.out.println("Opção inválida carro");
					break;
				}
			}
			else if (opcao == 2 ) {
				System.out.println("Sobre o Aviao:\n1) Escolher tipo\n2) Escolher Uso\n7) Sair");
				opcaoaviao = teclado.nextInt();
				switch (opcaoaviao) {
				case 1:
					System.out.println("Digite o Tipo de avião desejado");
					gastarteclado = teclado.nextLine();
					tipoaviao = teclado.nextLine();
					aviao1.settipo(tipoaviao);
					System.out.println("O tipo do avião é: " + aviao1.gettipo() + "\n");
					break;
				case 2:
					System.out.println("Digite o uso do seu aviao");
					gastarteclado = teclado.nextLine();
					usoaviao = teclado.nextLine();
					aviao1.setuso(usoaviao);
					System.out.println("O tipo do avião é: " + aviao1.getuso() + "\n");
					break;
				case 7:
					System.out.println("Qual veiculo você deseja?\n1) Carro\n2) Aviao");
					opcao = teclado.nextInt();
					break;
				default:
					System.out.println("Opção inválida aviao");
					break;
				}
			}
			
		} while (opcao != 1 || opcao != 2);
	}
}
