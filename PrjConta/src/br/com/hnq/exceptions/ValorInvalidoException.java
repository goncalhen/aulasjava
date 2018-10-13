package br.com.hnq.exceptions;

public class ValorInvalidoException extends Exception{
	
	public ValorInvalidoException(double valorInvalido) {
		// TODO Auto-generated constructor stub
		super("Valor Invalido: " + valorInvalido);

	}
	
	
}
 