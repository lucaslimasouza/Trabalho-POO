package br.ufla.sisconbi.poo.test;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import junit.framework.TestCase;

public class ManipuladorDeDataTeste extends TestCase {
	
	public void testDataAtual(){
		GregorianCalendar dataAtual = new GregorianCalendar();
		assertEquals((new Date()).toString(), dataAtual.getTime().toString());
	}
	
	public void testDataDevolucao(){
		GregorianCalendar dataDevolucao = new GregorianCalendar();
		dataDevolucao.set(Calendar.DAY_OF_MONTH, Calendar.DAY_OF_MONTH + 10);
		assertEquals (15, dataDevolucao.get(Calendar.DAY_OF_MONTH));
	}
}
