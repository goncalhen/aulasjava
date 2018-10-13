package br.com.hnq.main;
import br.com.hnq.contas.ContaCorrente;
import br.com.hnq.exceptions.ValorInvalidoException;

public class TestaContas {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente();

		cc.setAgencia(933);
		cc.setNomeTitular("Henrique");
		cc.setSaldo(50.0);
		cc.atualiza(0.1);
		System.out.println(cc.getSaldo());
		
		try {
			cc.deposita(-10);
		} catch (ValorInvalidoException e) {
			System.out.println(e.getMessage());
		}
		
//		ContaPoupanca cp = new ContaPoupanca();
//		
//		cp.setAgencia(933);
//		cp.setNomeTitular("Henrique");
//		cp.setSaldo(50.0);
//		cp.atualiza(0.1);
//		System.out.println(cp.getSaldo());

	}

}
