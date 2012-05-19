package br.ufla.sisconbi.poo.test;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import junit.framework.TestCase;
import br.ufla.sisconbi.poo.model.Emprestimo;
import br.ufla.sisconbi.poo.model.Livro;
import br.ufla.sisconbi.poo.model.Registro;

public class EmprestimoTeste extends TestCase{
	
	private List<Registro> registros;
	private GregorianCalendar dataPrevistaDevolucao;
	private GregorianCalendar dataAtual;
	private Emprestimo emprestimo;
	private Livro livro;

	public void testCriacao(){
		dataPrevistaDevolucao.set(Calendar.DAY_OF_MONTH, Calendar.DAY_OF_MONTH +10);
		assertEquals(emprestimo.getNumero()+" "+dataAtual.get(Calendar.DATE)+" "+dataPrevistaDevolucao.get(Calendar.DATE)+" [TDD Beck]", emprestimo.toString());
	}
	
	public void testDevolucaoDeLivro(){
		emprestimo.devolucao(livro);
		assertEquals(dataAtual.get(Calendar.DAY_OF_MONTH), emprestimo.getRegistros().get(0).getDataDeDevolucao().get(Calendar.DAY_OF_MONTH));
	}
	
	public void setUp(){
		registros = new ArrayList<Registro>();
		livro = new Livro("TDD", "Beck");
		registros.add(new Registro(livro));
		dataPrevistaDevolucao = new GregorianCalendar();
		dataAtual = new GregorianCalendar();
		emprestimo = new Emprestimo(registros);
	}
}
