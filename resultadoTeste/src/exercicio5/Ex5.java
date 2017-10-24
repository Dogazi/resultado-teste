package exercicio5;

public class Ex5 {
	
	public int occorencia(String texto, String ocorrencia) {
		if(texto == null) {
			throw new RuntimeException("Texto Vazio");
		}else {
				ocorrencia = ocorrencia.toLowerCase();
				texto = texto.toLowerCase();
			String[] teste = texto.split(ocorrencia);
			int quantidade = teste.length -1;
			if(quantidade == 0) {
				System.out.println("Ocorrência de " + ocorrencia + " não existe");
				return quantidade;
			}else {
				System.out.println(ocorrencia + " Apareceu no texto " + quantidade + " Vezes");
				return quantidade;
			}
		}
	}
}
