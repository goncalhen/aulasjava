class Conta {

	protected double saldo;

	public double getSaldo(){
		return this.saldo;
	}

	public void deposita(double v){
		this.saldo += v;
	}

	public void saca(double v){
		this.saldo -= v;
	}

	public void atualiza(double tx){
		this.saldo += this.saldo * tx;
	}

}

class ContaCorrente extends Conta {
	public void atualiza(double tx){
		this.saldo += this.saldo * (tx * 2);
	}
}

class ContaPoupanca extends Conta {
	public void atualiza(double tx){
		this.saldo += this.saldo * (tx * 3);
	}

	public void deposita(double v){
		this.saldo += v - 0.10;
	}
}

class AtualizadorDeContas{
	private double saldoTotal = 0;
	private double selic;

	public AtualizadorDeContas(double selic){
		this.selic = selic;
	}

	public void roda(Conta c){
		System.out.println("===============================================");

		System.out.println("Saldo Anterior: " + c.getSaldo());

		c.atualiza(this.selic);

		System.out.println("Saldo Atual: " + c.getSaldo());

		saldoTotal += c.getSaldo();
	}

	public double getSaldoTotal(){
		return this.saldoTotal;	
	}
}

class TesteConta {
	public static void main (String[] args){
		Conta c = new Conta();

		ContaCorrente cc = new ContaCorrente();

		ContaPoupanca cp = new ContaPoupanca();

		c.deposita(1000);
		cc.deposita(1000);
		cp.deposita(1000);

		AtualizadorDeContas xpto = new AtualizadorDeContas(0.01);

		xpto.roda(c);
		xpto.roda(cc);
		xpto.roda(cp);


		System.out.println("Saldo Total: " + xpto.getSaldoTotal());
	}
}
