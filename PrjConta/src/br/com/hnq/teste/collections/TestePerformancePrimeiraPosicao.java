package br.com.hnq.teste.collections;
import java.util.ArrayList;
import java.util.List;

public class TestePerformancePrimeiraPosicao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Iniciando...");
        long inicio = System.currentTimeMillis();

        // trocar depois por ArrayList                
        List<Integer> teste = new ArrayList<>();

        for (int i = 0; i < 30000; i++) {
            teste.add(0, i);
        }

        long fim = System.currentTimeMillis();
        double tempo = (fim - inicio) / 1000.0;
        System.out.println("Tempo gasto: " + tempo);
	}

}
