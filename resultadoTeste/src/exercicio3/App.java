package exercicio3;



public class App {
	public static void main(String[] args) {
		Ex3 lista = new Ex3();
		Item i1 = new Item(3);
		Item i2 = new Item(8);
		Item i3 = new Item(9);
		Item i4 = new Item(4);
		Item i5 = new Item(7);
		Item i6 = new Item(1);
		Item i7 = new Item(6);
		Item i8 = new Item(1);
		
		lista.push(i1);
		lista.push(i2);
		lista.push(i3);
		lista.push(i4);
		lista.push(i5);
		lista.push(i6);
		lista.push(i7);
		lista.push(i8);
		
		lista.pop(1);
		lista.getLista();		
	}
}