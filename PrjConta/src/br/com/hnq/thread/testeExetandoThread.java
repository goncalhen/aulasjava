package br.com.hnq.thread;

public class testeExetandoThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Programa pgm1 = new Programa();
		pgm1.setId(1);
		
		Thread t1 = new Thread(pgm1);
		t1.start();
		
		Programa pgm2 = new Programa();
		pgm2.setId(2);
		
		Thread t2 = new Thread(pgm2);
		t2.start();		
		
	}

}
