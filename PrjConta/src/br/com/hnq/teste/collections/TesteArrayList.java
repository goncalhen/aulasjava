package br.com.hnq.teste.collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> lista = new ArrayList<>();
		
		for (int i = 0 ; i <= 1000 ; i++) {
			lista.add(i);
		}
		
		Collections.reverse(lista);
		
		for (Integer i : lista) {
			System.out.println(i + " ");
		}
	}
}
