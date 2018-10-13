class Empresa {

	public String nome;
	public String cnpj;
	public String razaoSocial;
	private int qtdFuncEmpresa;
	private int indFunc = 0;
	private Funcionario[] funcionarios = new Funcionario[10];

	public Empresa(int qtd) {
		this.qtdFuncEmpresa = qtd;
	}

	void adicionaFuncionario (Funcionario func) {
		this.funcionarios[this.indFunc] = new Funcionario();
		if (this.funcionarios[this.indFunc].nome == null) {
			this.funcionarios[this.indFunc] = func;
			this.indFunc++;
			}

	}

	public Funcionario getFuncionario(int id){
		return	this.funcionarios[id];
	}

	public void imprimeFuncionarios () {
		for (int i = 0 ; i < this.funcionarios.length; i++) {
			if (this.funcionarios[i] == null) continue;
			System.out.println("Funcionario "+i+":");
			this.funcionarios[i].mostra();
		}
	}

	public boolean contem (Funcionario func) {
		boolean contem = false;
		for (int i = 0; (i < this.funcionarios.length); i++) {
			if (this.funcionarios[i] == func) {
				contem = true;
				continue;
			}		
		}
		return contem;
	}

}
