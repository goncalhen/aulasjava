package br.com.hnq.teste.collections;
import java.util.TreeSet;

public class TesteTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<Integer> conjunto = new TreeSet();
		
		for (int i = 0; i <= 1000; i++) {
			conjunto.add(i);
		}
		
		for (Integer i : conjunto.descendingSet()) {
			System.out.println(i + " ");
		}
		
	}

}
