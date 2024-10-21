package controller;

import model.Lista;

public class OrdenacaoLista {

	public OrdenacaoLista() {
		super();
	}
	
	public Lista<Integer> bubbleSort(Lista<Integer> lista) {
		
		int tamanho = lista.size();
		for (int i = 0; i < tamanho; i++) {
			for (int j = 0; j < tamanho - 1; j++) {
				try {
					if (lista.get(j) > lista.get(j + 1)) {
						int aux = lista.get(j);
						lista.set(j, lista.get(j + 1));
						lista.set(j + 1, aux);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		
		return lista;
	}
}

