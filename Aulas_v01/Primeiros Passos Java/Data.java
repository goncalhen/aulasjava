class Data {
	int dia;
	int mes;
	int ano;

	public Data(int dd, int mm, int aaaa){
		if (this.validaData(dd,mm,aaaa) == true){
			this.dia = dd;
			this.mes = mm;
			this.ano = aaaa;
		} else { System.out.println("Data informada invalida");}
	}

	private boolean validaData(int dd, int mm, int aaaa){
        	if (dia <= 0 || mes <= 0) {
            		return false;
        	}

        	int ultimoDiaDoMes = 31; // por padrao são 31 dias
        	
		if (mes == 4 || mes == 6 || mes == 9 || mes == 11 ) {
            		ultimoDiaDoMes = 30;
        	} else if (mes == 2) {
            		ultimoDiaDoMes = 28;
            		if((ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0))){
                		ultimoDiaDoMes = 29;
            		}
        	}
        
		if (dia > ultimoDiaDoMes) {
            		return false;
        	}

        	return true;	
	}

	String mostraData() {
		String getData = this.dia+"/"+this.mes+"/"+this.ano;
		return getData;
	};
}
