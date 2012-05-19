package br.ufla.sisconbi.poo.model;

import java.io.Serializable;

public class Usuario implements Serializable {

	
	private static final long serialVersionUID = 1L;
	private String nome;
	private String cpf;
	private String endereco;
	private String telefone;

	public Usuario(String nome, String cpf, String endereco, String telefone) {
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.telefone = telefone;	
	}

	public String toString (){
		return nome + " " + cpf + " " +endereco + " " + telefone;
	}
	
	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	@Override
	public boolean equals(Object object) {
		Usuario usuario =  (Usuario) object;		
		return (this.nome.equals(usuario.getNome()) && this.cpf.equals(usuario.getCpf()) && this.endereco.equals(usuario.getEndereco())
				&& this.telefone.equals(usuario.getTelefone()));
	}
}
