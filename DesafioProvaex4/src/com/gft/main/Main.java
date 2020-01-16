package com.gft.main;

import com.gft.model.*;

public class Main {

	public static void main(String[] args) {
		Gerente gerente1 = new Gerente("Carlos", 48, 25000);
		Supervisor supervisor1 = new Supervisor("Rodrigo", 20, 8000);
		Vendedor vendedor1 = new Vendedor("Luan Everton", 23, 2500);
		
		System.out.printf("O Gerente: %s Mattos, com a idade: %d anos, tem o salario %.2f\n", gerente1.getNome(), 
				gerente1.getIdade(), gerente1.Bonificacao());
		System.out.printf("O Supervisor: %s, com a idade: %d anos, tem o salario %.2f\n", supervisor1.getNome(), 
				supervisor1.getIdade(), supervisor1.Bonificacao());
		System.out.printf("O Vendedor: %s, com a idade: %d anos, tem o salario %.2f\n", vendedor1.getNome(), 
				vendedor1.getIdade(), vendedor1.Bonificacao());
	}

}
