package br.ufla.sisconbi.poo.test;

import java.util.GregorianCalendar;

import junit.framework.TestCase;
import br.ufla.sisconbi.poo.model.Livro;
import br.ufla.sisconbi.poo.model.Registro;

public class RegistroTeste extends TestCase {
	
	private Livro livro;
	private Registro registro;
	
	public void testCriacao(){
		assertEquals(livro.toString(), registro.toString());
	}
	
	public void testDataDeDevolucao(){
		GregorianCalendar dataAtual = new GregorianCalendar();
		assertEquals(null, registro.getDataDeDevolucao());
		registro.setDataDeDevolucao(dataAtual);
		assertEquals(new GregorianCalendar().toString(), registro.getDataDeDevolucao().toString());	
	}
	
	public void testIgualdade(){
		assertFalse(registro.equals(new Registro(new Livro("Refactoring","Autores"))));
		assertTrue(registro.equals(registro));
	}
	
	public void setUp(){
		livro = new Livro("TDD","Autores");
		registro = new Registro(livro);
	}
}
