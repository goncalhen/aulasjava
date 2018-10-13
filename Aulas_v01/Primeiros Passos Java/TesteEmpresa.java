class TesteEmpresa {
	public static void main (String[] args) {

	Empresa emp1 = new Empresa(10);

	emp1.nome = "Primeira Empresa";
	emp1.cnpj = "12345678/0001-10";
	emp1.razaoSocial = "Teste de Empresa";

	Funcionario func01 = new Funcionario();

	func01.nome = "Jorge";
	func01.setSalario (5000.0);
	func01.setDataDeEntrada(03,07,2017);
	func01.setRG("12.345.678-91");
	func01.setDepartamento("Comercial e Marketing");
	func01.setPromocao("Analista de Marketing PL");

	emp1.adicionaFuncionario(func01);

	System.out.println(emp1.getFuncionario(0));

	}
}
