package br.com.hnq.java.lang;

import br.com.hnq.contas.Conta;
import br.com.hnq.contas.ContaCorrente;

public class testLangClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Conta conta = new ContaCorrente();
//		conta.setSaldo(250.0);
//		conta.setNumero(123456);
//		System.out.println(conta);
//		
//		
//		Conta conta2 = new ContaCorrente();
//		conta2.setNumero(123456);
//		
//		if (conta.equals(conta2)) {
//			System.out.println("contas iguais");
//		} else {
//			System.out.println("contas diferentes");
//		}

//		String nome = "anotaram a data da maratona";
//
//		String[] palavra = nome.split(" ");
//		
//		for (int i = palavra.length - 1; i >= 0; i--) {
//			System.out.print(palavra[i] + " ");
//		}
//		
//		String nome2 = "Teste com String Builder, vamos ver como é";
//		
//		System.out.print("\t");
//		StringBuilder invertido = new StringBuilder(nome2);
//		System.out.println(invertido);

		String num = "762";
		int resultado = 0;
		resultado = resultado * 10 + (num.charAt(0) - '0');
		System.out.println(resultado);
		
	}

}
