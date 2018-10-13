class TesteFuncionario {
	public static void main (String[] args) {

	Funcionario func01 = new Funcionario();

	func01.nome = "Jorge";
	func01.salario = 5000.0;
	func01.dataDeEntrada = "13/04/2016";
	func01.rg = 1234567891;
	func01.departamento = "Comercial e Marketing";
	func01.cargo = "Analista de Marketing PL";

	func01.recebeAumento(0.15);

	func01.mostra();
	}
}
