package exercicio3;

import java.util.LinkedList;


public class Ex3 {
	private LinkedList<Item> lista = new LinkedList<>();
	
	public Ex3(){
	}
	
	public void push(Item val){
		lista.push(val);
	}
	
	public void pop(int remove){
		for (int index = 0; index < lista.size(); index++) {
			if (lista.get(index).getVal() == remove) {
				lista.remove(index);
			}
		}
	}

	public LinkedList<Item> getLista() {
		for (int i = 0; i < lista.size(); i++) {
			 System.out.print(" "+lista.get(i).getVal());
		}
		return lista;
	}

}
