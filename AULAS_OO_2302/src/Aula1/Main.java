package Aula1;

public class Main {
	public static void main(String[] args) throws Exception {
		CalculaSalario c1 = new CalculaSalario();
		Funcionario f1 = new Funcionario(3000, Cargo.Desenvolvedor);
		Funcionario f2 = new Funcionario(3000, Cargo.DBA);
		Funcionario f3 = new Funcionario(3000, Cargo.Tester);
		
		System.out.println(c1.CalculaSalario(f1));
		System.out.println(c1.CalculaSalario(f2));
		System.out.println(c1.CalculaSalario(f3));
	}
}
