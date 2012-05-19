package br.ufla.sisconbi.poo.model;

import java.io.Serializable;
import java.util.GregorianCalendar;

public class Registro implements Serializable{

	
	private static final long serialVersionUID = 1L;
	private GregorianCalendar dataDeDevolucao = null;
	private Livro livro;

	public Registro(Livro livro) {
		this.livro = livro;
	}

	public GregorianCalendar getDataDeDevolucao() {
		return dataDeDevolucao;
	}

	public void setDataDeDevolucao(GregorianCalendar data) {
		dataDeDevolucao = data;
	}
	
	public Livro getLivro() {
		return livro;
	}

	@Override
	public boolean equals(Object obj) {
		Registro registro = (Registro) obj;
		return this.livro.equals(registro.getLivro());
	}
	
	@Override
	public String toString() {
		return livro.toString();
	}
}
