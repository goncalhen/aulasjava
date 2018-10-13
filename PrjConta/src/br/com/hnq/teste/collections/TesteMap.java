package br.com.hnq.teste.collections;
import java.util.HashMap;
import java.util.Map;

import br.com.hnq.contas.Conta;
import br.com.hnq.contas.ContaCorrente;
import br.com.hnq.exceptions.ValorInvalidoException;

public class TesteMap {

	public static void main(String[] args) throws ValorInvalidoException {
		// TODO Auto-generated method stub

		Conta c1 = new ContaCorrente();
		c1.deposita(10000);
		
		Conta c2 = new ContaCorrente();
		c2.deposita(3000);
		
		//criar mapa
		Map<String, Conta> mapaDeContas = new HashMap<String, Conta>();
		
		//adiciona chaves e seus valores
		mapaDeContas.put("diretor", c1);
		mapaDeContas.put("gerente", c2);
		
		Conta contaDoDiretor = mapaDeContas.get("diretor");
		System.out.println(contaDoDiretor.getSaldo());
		
		
	}

}
