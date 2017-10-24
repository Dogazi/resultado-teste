package exercicio4;

import java.util.ArrayList;
import java.util.List;

public class Ex4 {
	
	public List<Integer> troco(int valor) {
		List<Integer> nota = new ArrayList<Integer>();
		if(valor < 0) {
			throw new RuntimeException("Valor negativo");
		}else {
			if(valor == 0) {
				return nota;
			}else {
				while(valor > 0) {
					if(valor >= 100) {
						valor = valor - 100;
						nota.add(100);
						troco(valor);
					}else {
						if(valor >= 50) {
							valor = valor - 50;
							nota.add(50);
							troco(valor);
						}else {
							if(valor >= 20) {
								valor = valor - 20;
								nota.add(20);
								troco(valor);
							}else {
								if(valor >= 10) {
									valor = valor - 10;
									nota.add(10);
									troco(valor);
								}else {
									if(valor >= 5) {
										valor = valor - 5;
										nota.add(5);
										troco(valor);
									}else {
										if(valor >= 2) {
											valor = valor - 2;
											nota.add(2);
											troco(valor);
										}else {
											if(valor == 1) {
												valor = valor - 1;
												nota.add(1);
												troco(valor);
											}
										}
									}
								}
							}
						}
					}
				}
			}
			
		}
		return nota;
	}
	
}
