package exercicio3;

import static org.junit.Assert.*;

import org.junit.Test;


public class Ex3Teste {
	@Test
	public void test3() {
		Ex3 lista = new Ex3();
		Item i1 = new Item(3);
		Item i2 = new Item(8);
		Item i3 = new Item(9);
		Item i4 = new Item(4);
		Item i5 = new Item(7);
		Item i6 = new Item(6);
		
		lista.push(i1);
		lista.push(i2);
		lista.push(i3);
		lista.push(i4);
		lista.push(i5);
		lista.push(i6);		
		
		Ex3 teste3 = new Ex3();
		for (int i = 0; i < teste3.getLista().size(); i++) {
			System.out.println(lista.getLista().get(i).getVal());
			assertEquals(lista.getLista().get(i).getVal(), teste3.getLista().get(i).getVal());
		}
			
		
	}

}
