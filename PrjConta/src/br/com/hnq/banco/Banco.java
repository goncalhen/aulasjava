package br.com.hnq.banco;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.hnq.contas.Conta;

public class Banco {

	private List<Conta> Contas = new ArrayList<>();
	Map<String, Conta> indexContaPorNome = new HashMap<String, Conta>();
	
	public void addConta(Conta ct) {
		Contas.add(ct);
		indexContaPorNome.put(ct.getNomeTitular(), ct);
	}
	
	public Conta pega(int posicao) {
		return Contas.get(posicao);
	}
	
	public int getQuantidadeDeContas() {
		return Contas.size();
	}
	
	public Conta buscaPorNome(String nome) {
		return indexContaPorNome.get(nome);
	}
	
}