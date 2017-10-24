package exercicio2;


public class Ex2 {
	private Integer n;
	
	public Ex2(int valor){
		if(valor > 2){
			this.n = valor;
		}else{
			System.out.println("Valor deve ser maior que 2");
		}
	}
	
	public int escada(){
		Integer conta = 0;
		String espaço = "%".concat(n.toString()) + "s";
		String retorno = "";
		for (int tam = 0; tam < n; tam++) {
				conta += 1;
				retorno = retorno + "#";
				System.out.println(String.format(espaço, retorno).replace(' ', ' '));
		}
		System.out.println();
		return conta;
	}
}