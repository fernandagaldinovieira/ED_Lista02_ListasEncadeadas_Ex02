package view;

import controller.OrdenacaoLista;

import model.Lista;

public class Principal {
	public static void main(String[] args) {
		
		OrdenacaoLista ordenacao = new OrdenacaoLista();
		
		try {
			Lista<Integer> lista = new Lista<>();
			lista.addFirst(10);
			lista.add(5, 1);
			lista.add(8, 2);
			lista.add(1, 3);
			lista.add(9, 4);
			lista.add(2, 5);
			lista.add(4, 6);
			lista.add(7, 7);
			lista.add(3, 8);
			lista.add(6, 9);
			
			System.out.println("Lista original:");
			for (int i = 0; i < lista.size(); i++) {
				System.out.println(lista.get(i));
			}
			
			lista = ordenacao.bubbleSort(lista);
			System.out.println("Lista ordenada:");
            for (int i = 0; i < lista.size(); i++) {
                System.out.println(lista.get(i));
            }
            
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
}
