package com.gft.Desafio04.model;

import java.util.List;

public class Loja {
	protected String nome;
	protected String cnpj;
	private List<Livro> livros;
	private List<VideoGame> videoGames;

	// Construtor
	public Loja() {
	}

	public Loja(String nome, String cnpj, List<Livro> livros, List<VideoGame> videoGames) {
		this.nome = nome;
		this.cnpj = cnpj;
		this.livros = livros;
		this.videoGames = videoGames;
	}

	// Getters e Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}

	public List<VideoGame> getVideoGames() {
		return videoGames;
	}

	public void setVideoGames(List<VideoGame> videoGames) {
		this.videoGames = videoGames;
	}

	// Métodos
	public void listaLivros() {
		System.out.println("A Loja Americanas possui estes livros para venda:");
		for (Livro index : livros) {
			if (index.getQtd() != 0) {
				System.out.println("Titulo:" + index.getNome() + " preço: " + index.getPreco() + " quantidade: "
						+ index.getQtd() + " em estoque.");
			} else {
				System.out.println("A loja não tem livros no seu estoque");
			}

		}
	}

	public void listaVideoGame() {
		System.out.println("A Loja Americanas possui estes Video-games para venda:");
		for (VideoGame index : videoGames) {
			if (index.getQtd() != 0) {
				System.out.println("Video Game:" + index.getModelo() + " preço: " + index.getPreco() + " quantidade: "
						+ index.getQtd() + " em estoque.");
			} else {
				System.out.println("A loja não tem video-games no seu estoque");
			}

		}
	}

	public void calculaPatrimonio() {
		double valorPatrimonio = 0;

		for (Livro index : livros) {
			if (index.getQtd() != 0) {
				valorPatrimonio += index.getPreco() * index.getQtd();
			} else {
				valorPatrimonio += 0;
			}
		}
		
		for (VideoGame index : videoGames) {
			if (index.getQtd() != 0) {
				valorPatrimonio += index.getPreco() * index.getQtd();
			}
		}
		
		System.out.println("O Patrimonio da loja Americanas é: R$" + valorPatrimonio);
	}
}