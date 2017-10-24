package exercicio2;

import static org.junit.Assert.*;

import org.junit.Test;

public class Ex2Teste {
	@Test
	public void test2() {		
		Ex2 teste2 = new Ex2(5);
		
		assertEquals(5, teste2.escada());
		
	}
}
