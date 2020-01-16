package com.gft.main;

import com.gft.model.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa("João", 15);
		Pessoa pessoa2 = new Pessoa("Leandro", 21);
		Pessoa pessoa3 = new Pessoa("Paulo", 17);
		Pessoa pessoa4 = new Pessoa("Jessica", 18);

		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas.add(pessoa1);
		pessoas.add(pessoa2);
		pessoas.add(pessoa3);
		pessoas.add(pessoa4);

		System.out.println("Questão 1: Instancie o objeto e a Lista<Pessoa>, adicione os dados conforme a tabela abaixo "
				+ "e por fim imprima o nome da pessoa mais velha");
		
		int maior = 0;
		String maiorNome = "";
		
		for (Pessoa index : pessoas) {
			if (index.getIdade() > maior) {
				maior = index.getIdade();
				maiorNome = index.getNome();
			}
		}
		
		System.out.printf("A pessoa mais velha é: %s com %d anos\n", maiorNome, maior);

		
		System.out.println("--------------------------------------------------------------");
		
		System.out.println("Questão 2: Exclua da Lista as pessoas com idade inferior a 18 anos e exiba a quantidade da lista "
				+ "antes e depois da exclusão");
		System.out.println("Lista antes de excluir");
		for (Pessoa index : pessoas) {
			System.out.printf("Nome: %s, idade: %d\n", index.getNome(), index.getIdade());	
		}
		
		pessoas.removeIf(x -> x.getIdade() < 18);
		
		System.out.println("\nLista depois de excluir");
		for (Pessoa index : pessoas) {
			System.out.printf("Nome: %s, idade: %d\n", index.getNome(), index.getIdade());	
		}
		System.out.println("--------------------------------------------------------------");
		
		System.out.println("Questão 3: Consultar se o objeto Jessica existe na lista e exibir sua idade");
		for (Pessoa index : pessoas) {
			if (index.getNome() == "Jessica") {
				System.out.printf("Nome: %s, idade: %d\n", index.getNome(), index.getIdade());
			}
		}
		
		System.out.println("--------------------------------------------------------------");
		
		
		
		
		
	}

}
