package br.com.hnq.contas;
import br.com.hnq.interfaces.Tributavel;

public class ContaCorrente extends Conta implements Tributavel {

	@Override
	public void atualiza(double taxa) {
		this.saldo += this.saldo * (taxa * 2);
	}

	public double getSaldo() {
		return this.saldo;
	}
	
	@Override
	public double calculaTributos() {
		// TODO Auto-generated method stub
		return this.getSaldo() * 0.01;
	}
	
}