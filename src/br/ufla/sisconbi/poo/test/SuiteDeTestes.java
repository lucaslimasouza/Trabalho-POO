package br.ufla.sisconbi.poo.test;

import junit.framework.Test;
import junit.framework.TestSuite;

public class SuiteDeTestes {

	public static Test suite() {
		TestSuite suite = new TestSuite(SuiteDeTestes.class.getName());
		//$JUnit-BEGIN$
		suite.addTestSuite(EmprestimoTeste.class);
		suite.addTestSuite(RegistroTeste.class);
		suite.addTestSuite(ManipuladorDeDataTeste.class);
		suite.addTestSuite(BibliotecaTeste.class);
		suite.addTestSuite(UsuarioTeste.class);
		suite.addTestSuite(LivroTeste.class);
		//$JUnit-END$
		return suite;
	}

}
