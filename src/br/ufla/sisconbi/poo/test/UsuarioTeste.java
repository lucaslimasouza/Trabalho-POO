package br.ufla.sisconbi.poo.test;

import br.ufla.sisconbi.poo.model.Usuario;
import junit.framework.TestCase;

public class UsuarioTeste extends TestCase {
	
	private Usuario usuario;
	
	public void testCriarUsuario (){
		assertEquals("José 123456789 Centro 1234-5987",usuario.toString());
		
	}
	
	public void testIgualdadeDeUsuario (){
		assertTrue(usuario.equals(usuario));
		assertFalse (usuario.equals(new Usuario("Samuel", "123456", "Centro", "123456")));
	}

	public void setUp(){
		usuario = new Usuario("José","123456789","Centro","1234-5987");
	}
}
