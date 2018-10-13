package br.com.hnq.sistema;
import br.com.hnq.contas.Conta;

public class AtualizadorDeConta {
	private double saldoTotal;
	private double selic;

	public AtualizadorDeConta(double selic) {
		this.selic = selic;
	}

	private void roda(Conta c) {
		System.out.println("======================");
		System.out.println("Saldo Anterior: " + c.getSaldo());
		c.atualiza(this.selic);
		System.out.println("Saldo Atual: " + c.getSaldo());
		;
		saldoTotal += c.getSaldo();

	}

	public double getSaldoTotal() {
		return this.saldoTotal;
	}

}
