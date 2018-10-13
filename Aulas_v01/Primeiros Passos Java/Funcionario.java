class Funcionario {
	private int codigoFunc;
	public String nome;
	private double salario;
	private Data dataDeEntrada;
	private String rg;
	private String departamento = " ";
	private String cargo = " ";
	private static int numIncremental;

	public Funcionario(String nome){
		this.nome = nome;
		numIncremental++;
		this.codigoFunc = numIncremental;
	}

	public int getCodFunc(){
		return codigoFunc;	
	}

	public void setDataDeEntrada(int dd, int mm, int aaaa) {
		this.dataDeEntrada = new Data(dd,mm,aaaa);
	}

	public void setRG(String texto) {
		this.rg = texto;	
	}

	public void setCodigoFunc(int num) {
		this.codigoFunc = num;	
	}	
	
	public void setRecebeAumento(double percDeAumentoSalarial) {
		this.salario += this.salario * percDeAumentoSalarial;
	}

	public double getSalario(){
		return this.salario;	
	}

	public String getDepartamento(){
		return this.departamento;	
	}

	public void setSalario(double num) {
		if (this.salario != 0) {
			System.out.println("Este funcionario ja possui salario atribuido.");
		} else { this.salario = num; }; 
	}

	public void setDepartamento(String depart) {
		if (this.departamento != " ") {
			System.out.println("Este funcionario ja possui departamento atribuido.");
		} else { this.departamento = depart; }; 
	}

	public double getGanhoAnual () {
		return this.salario *= 12;	
	}

	public void setPromocao (String novoCargo) {
		this.cargo = novoCargo;
	}

	
	public void mostra() {
		System.out.println("Nome           : "+this.nome);
		System.out.println("Salario        : "+this.salario);
		System.out.println("Data de Entrada: "+this.dataDeEntrada.mostraData());
		System.out.println("RG             : "+this.rg);
		System.out.println("Departamento   : "+this.departamento);
		System.out.println("Cargo          : "+this.cargo);
	}
}


