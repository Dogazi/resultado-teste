package exercicio5;

import static org.junit.Assert.*;

import org.junit.Test;


public class Ex5Teste {

	@Test
	public void test1() {
		Ex5 teste5 = new Ex5();
		
		assertEquals("Ocorrencia deveria ser 2", teste5.occorencia("Programador Programação", "ama"), 2);
	}
}
