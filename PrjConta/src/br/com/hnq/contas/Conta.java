package br.com.hnq.contas;
import br.com.hnq.exceptions.ValorInvalidoException;

public abstract class Conta implements Comparable<Conta> {

	protected int agencia;
	protected double saldo;
	protected String nomeTitular;
	protected int numero;
	
	public double getSaldo() {
		return saldo;
	}	
	
	public void deposita(double v) throws ValorInvalidoException{
		if (v < 0) {
			throw new ValorInvalidoException(v);
		} else {
		this.saldo += v;
		}
	}
	
	public void saca(double v){
		this.saldo -= v;
	}

	public abstract void atualiza(double taxa);

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nome do Titular:" + this.nomeTitular 
				+ " | Numero da Conta:" + this.numero
				+ " | Saldo R$:" + this.saldo + "951302096 - Clovis";
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		// TODO Auto-generated method stub
//		Conta outraConta = (Conta) obj;
//		return this.numero == outraConta.numero &&
//				this.nomeTitular.equals(outraConta.nomeTitular);
//	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public String getNomeTitular() {
		return nomeTitular;
	}
	
	@Override
	public int compareTo(Conta o) {
		// TODO Auto-generated method stub
		return this.nomeTitular.compareTo(o.nomeTitular);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numero;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		if (numero != other.numero)
			return false;
		return true;
	}
	
	
}
