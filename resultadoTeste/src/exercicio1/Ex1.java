package exercicio1;

import java.lang.reflect.Array;

public class Ex1 {
	private long[] nova = {2, 4, 3, 5, 1};
	
	public Ex1(){
	}
	
	public long duplicado(){		
		long retorno = -1;
		
		for (int index = 1; index < nova.length; index++) {
			if(nova[index-1] == nova[index]){
				retorno = Array.getLong(nova, index-1);
				}
			}
		return retorno;
		}
	}
