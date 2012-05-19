package br.ufla.sisconbi.poo.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Biblioteca {
	
	private List<Usuario> usuarios;
	private Map<Livro, Boolean> estoqueDeLivros;
	private Map<Usuario, Emprestimo> relacaoDeEmprestimos;
	
	public Biblioteca() {
		usuarios = new ArrayList<Usuario>(); 
		estoqueDeLivros = new HashMap<Livro, Boolean>();
		relacaoDeEmprestimos = new HashMap<Usuario, Emprestimo>();
	}

	public void adicionaUsuario(Usuario usuario) {
		usuarios.add(usuario);
	}

	public List<Usuario> usuariosCadastrados() {
		return usuarios ;
	}

	public void adicionaLivro(Livro livro) {
		this.estoqueDeLivros.put(livro, true);
	}
	
	public Map<Livro, Boolean> livrosCadastrados(){
		return estoqueDeLivros;
	}

	public void remocaoDeLivroPor(String titulo) {
		estoqueDeLivros.remove(livroNaListaPorAutorOuTitulo(titulo));
	}

	public Livro pesquisaLivroPor(String titulo) {
		return livroNaListaPorAutorOuTitulo(titulo);
	}

	public Livro pesquisaLivroPorAutor(String nome) {
		return livroNaListaPorAutorOuTitulo(nome);
	}

	private Livro livroNaListaPorAutorOuTitulo(String argumento) {
		for(Livro livro: estoqueDeLivros.keySet()){
			 if(livro.getAutores().equals(argumento) || livro.getTitulo().equals(argumento)) return livro;
		}return null;
	}

	public Map<Usuario, Emprestimo> relacaoDeEmprestimos() {
		return relacaoDeEmprestimos;
	}

	public void novoEmprestimo(Usuario usuario, Emprestimo emprestimo) {
		manipulacaoDeEstadoDoLivro(emprestimo.getRegistros(), false);
		relacaoDeEmprestimos.put(usuario, emprestimo);
	}

	public void excluiUsuario(Usuario usuario) {
		if (!relacaoDeEmprestimos.containsKey(usuario))
			usuarios.remove(usuario);
	}

	public void exclusaoDeEmprestimoPelo(Usuario usuario) {
		manipulacaoDeEstadoDoLivro(relacaoDeEmprestimos.get(usuario).getRegistros(), true);
		relacaoDeEmprestimos.remove(usuario);
	}

	public void devolucaoDeItemNaRelacaoDeEmprestimo(Usuario usuario,Livro livro) {
		relacaoDeEmprestimos.get(usuario).devolucao(livro);
		estoqueDeLivros.put(livro, true);
	}
	
	private void manipulacaoDeEstadoDoLivro(List<Registro> registros, boolean novoEstado) {
		for (Registro registro : registros)
			estoqueDeLivros.put(registro.getLivro(), novoEstado);
	}
	
	public void liberacaoDeUnicoLivro(Livro livro) {
		estoqueDeLivros.put(livro, false);
	}

}
