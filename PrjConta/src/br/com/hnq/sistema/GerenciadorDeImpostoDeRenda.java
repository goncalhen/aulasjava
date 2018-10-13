package br.com.hnq.sistema;
import br.com.hnq.interfaces.Tributavel;

public class GerenciadorDeImpostoDeRenda {
	private double total;
	
	public void adiciona(Tributavel t) {
		System.out.println("Adiciona tributavel: " + t);
		this.total += t.calculaTributos();
	}
	
	public double getTotal() {
		return this.total;
	}
	
}