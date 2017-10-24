package exercicio1;

import static org.junit.Assert.*;

import org.junit.Test;

public class Ex1Teste {

	@Test
	public void test1() {
		Ex1 teste = new Ex1();
		
		assertEquals(-1, teste.duplicado());
	}
}
