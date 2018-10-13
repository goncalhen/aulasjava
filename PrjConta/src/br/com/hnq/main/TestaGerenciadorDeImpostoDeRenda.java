package br.com.hnq.main;
import br.com.hnq.contas.ContaCorrente;
import br.com.hnq.exceptions.ValorInvalidoException;
import br.com.hnq.sistema.GerenciadorDeImpostoDeRenda;
import br.com.hnq.sistema.SeguroVida;

public class TestaGerenciadorDeImpostoDeRenda {

	public static void main(String[] args) throws ValorInvalidoException {
		// TODO Auto-generated method stub

		GerenciadorDeImpostoDeRenda gerenciador = new GerenciadorDeImpostoDeRenda();
		SeguroVida sv = new SeguroVida();
		ContaCorrente cc = new ContaCorrente();
		
		gerenciador.adiciona(sv);

		cc.deposita(1000);
		gerenciador.adiciona(cc);
		
		System.out.printf("O saldo é: " + cc.getSaldo());
		
//		System.out.println(gerenciador.getTotal());
		
	}

}
