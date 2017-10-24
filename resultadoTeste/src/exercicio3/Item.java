package exercicio3;

public class Item {
	private int val;
	private Item prox;
	
	public Item(int val){
		this.val = val;
		this.prox = null;
	}

	public int getVal() {
		return val;
	}
}
