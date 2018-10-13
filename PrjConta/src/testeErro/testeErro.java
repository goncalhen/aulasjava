package testeErro;

public class testeErro {
	public static void main(String[] args) {
		System.out.println("Inicio do Main");
		try {
			metodo1();
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
        	System.out.println("Erro: " + e);
		}
		System.out.println("Fim do Main");
	}

	private static void metodo1() {
		// TODO Auto-generated method stub
		System.out.println("inicio do metodo1");
		metodo2();
        System.out.println("fim do metodo1");
	}

	private static void metodo2() {
		// TODO Auto-generated method stub
		System.out.println("inicio do metodo2");
        int[] array = new int[10];
        
        
        for (int i = 0; i <= 15; i++) {
        		array[i] = i;            
        		System.out.println(i);

        } 
        System.out.println("fim do metodo2");
	}

}
