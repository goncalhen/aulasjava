package br.com.hnq.teste.collections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import br.com.hnq.contas.Conta;
import br.com.hnq.contas.ContaPoupanca;

public class TesteOrdenacao {

	public static void main(String[] args) {
		
	    List<Conta> contas = new ArrayList<Conta>();
	    Random random = new Random();

	    ContaPoupanca c1 = new ContaPoupanca(random.nextInt(2000), "Caio", 0);
	    c1.deposita(random.nextInt(10000) + random.nextDouble());
	    contas.add(c1);

	    ContaPoupanca c2 = new ContaPoupanca(random.nextInt(2000), "Adriano", 0);
	    c2.deposita(random.nextInt(10000) + random.nextDouble());
	    contas.add(c2);

	    ContaPoupanca c3 = new ContaPoupanca(random.nextInt(2000), "Victor", 0);
	    c3.deposita(random.nextInt(10000) + random.nextDouble());
	    contas.add(c3);

	    Collections.sort(contas);

	    for (Conta conta : contas) {
	      System.out.println(conta);
	    }
		
		System.out.println(contas);
	}
	
}
