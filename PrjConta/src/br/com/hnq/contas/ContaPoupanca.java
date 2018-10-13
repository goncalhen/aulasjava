package br.com.hnq.contas;
public class ContaPoupanca extends Conta {

	public ContaPoupanca(double saldo, String nome, int numero) {
		// TODO Auto-generated constructor stub
			this.saldo = saldo;
			this.nomeTitular = nome;
			this.numero = numero;
	}
	
	public void deposita(double vlrDeposita) {
		this.saldo += vlrDeposita - 0.1;
	}

	@Override
	public void atualiza(double taxa) {
		this.saldo += this.saldo * (taxa * 0.5);
	}

}
