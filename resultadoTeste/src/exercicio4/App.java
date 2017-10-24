package exercicio4;

import java.util.ArrayList;
import java.util.List;

import exercicio2.Ex2;
import exercicio3.Ex3;
import exercicio3.Item;
import exercicio4.Ex4;

public class App {
	public static void main(String[] args) {
		
		Ex4 troco = new Ex4();
		List <Integer> notas = new ArrayList<Integer>();
		notas = troco.troco(45);
		
		System.out.println("Notas para o Troco: "+ notas);
		
		
			
		
	}
}