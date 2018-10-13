package br.com.hnq.thread;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Vector;

import javax.sql.rowset.spi.SyncResolver;

public class ProduzMensagens implements Runnable {

	private int comeco;
	private int fim;
	private LinkedList<String> mensagens;
	
	public ProduzMensagens(int comeco, int fim, LinkedList<String> mensagens) {
		this.comeco = comeco;
		this.fim = fim;
		this.mensagens = mensagens;
	}
		
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = comeco; i < fim; i++) {
//			synchronized (mensagens) {
//				mensagens.add("Mensagem " + i);
//			}
			mensagens.add("Mensagem " + i);
		}
	}

}
