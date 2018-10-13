package br.com.hnq.thread;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Vector;

public class RegistroDeMensagem {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		Collection<String> mensagens = new LinkedList<String>();	// precisa de synchronized
//		Vector<String> mensagens = new LinkedList<String>(); 		// não precisa de synchronized
//		HashSet<String> mensagens = new LinkedList<String>();		// precisa de synchronized
		LinkedList<String> mensagens = new LinkedList<String>(); 	// precisa de synchronized
		
		Thread t1 = new Thread(new ProduzMensagens(0,10000,mensagens));
		Thread t2 = new Thread(new ProduzMensagens(10000,20000,mensagens));
		Thread t3 = new Thread(new ProduzMensagens(20000,30000,mensagens));
		
		t1.start();
		t2.start();
		t3.start();
		
		System.out.println("Threads produtoras de mensagens finalizadas");
		
		for (int i = 0; i < 30000; i++) {
			if (!mensagens.contains("Mensagem " + i)){
				throw new IllegalStateException("Não encontrei a mensagem: " + 1);
			}
		}
		
		if (mensagens.contains(null)) {
			throw new IllegalStateException("Não devia ter Null aqui!");
		}
		
		System.out.println("Fim da execução com sucesso");
	}

}
