package exercicio4;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;


public class Ex4Teste {

	@Test
	public void test1() {
		Ex4 teste4 = new Ex4();
		List<Integer> troco1 = new ArrayList<Integer>();
		troco1 = teste4.troco(45);
		System.out.println(troco1);
		assertEquals("O troco deveria ter tamanho 3", troco1.size(), 3);
		assertNotEquals("O troco deveria ter o tamanho diferente do informado", troco1.size(), 4);
		
		assertTrue("O troco deveria contar com uma nota de 5 reais", troco1.contains(5));
		assertTrue("O troco deveria contar com uma nota de 20 reais", troco1.contains(20));
		assertTrue("O troco deveria contar com uma nota de 20 reais", troco1.contains(20));
		assertFalse("O troco não deveria conter essa nota", troco1.contains(2));
	}

}
