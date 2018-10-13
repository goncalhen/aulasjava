package br.com.hnq.interfaces;

interface AreaCalculavel {
	double calculaArea();	
}

class Quadrado implements AreaCalculavel{
	private int lado;
	
	public Quadrado(int lado) {
		this.lado = lado;
	}
	
	public double calculaArea() {
		return this.lado * this.lado;
	}
	
}

class Retangulo implements AreaCalculavel {
	private int largura;
	private int altura;
	
	public Retangulo(int largura, int altura) {
		this.largura = largura;
		this.altura  = altura;
	}
	
	public double calculaArea() {
		return this.largura * this.altura;
	}
	
}

class Circulo implements AreaCalculavel {
	private int raio;
	
	public Circulo (int raio) {
		this.raio = raio;
	}
	
	public double calculaArea() {
		return Math.PI * raio * raio;
	}
}


