package br.com.hnq.main;
import br.com.hnq.contas.ContaCorrente;
import br.com.hnq.exceptions.ValorInvalidoException;
import br.com.hnq.interfaces.Tributavel;

public class TesteTributo {

	public static void main(String[] args) throws ValorInvalidoException {
		// TODO Auto-generated method stub

		ContaCorrente cc = new ContaCorrente();
		cc.deposita(100);
		System.out.println(cc.calculaTributos());
		
		Tributavel t = cc;
		System.out.println(t.calculaTributos());
		
	}

}
