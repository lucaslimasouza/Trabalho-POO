package br.ufla.sisconbi.poo.model;

import java.io.Serializable;

public class Livro implements Serializable {


	private static final long serialVersionUID = 1L;
	private  Integer codigo;
	private  String titulo;
	private  String autores;
	
	public Livro(String titulo, String autores) {
		this.codigo = (int) (Math.random() * 10000);
		this.titulo = titulo;
		this.autores = autores;
	}
	
	public String getTitulo(){
		return titulo;
	}
	
	public Integer getCodigo(){
		return codigo;
	}

	public String getAutores() {
		return autores;
	}

	@Override
	public boolean equals(Object obj) {
		Livro livro = (Livro) obj;
		return titulo.equals(livro.getTitulo()) & autores.equals(livro.getAutores())
		& codigo.equals(livro.getCodigo());
	}
	
	@Override
	public String toString() {
		return titulo+" "+autores;
	}
}
