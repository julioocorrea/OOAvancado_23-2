package Aula1;

public class CalculaSalario {
	public double CalculaSalario(Funcionario funcionario){
		return funcionario.getcargo().getRegraCalculo().calcular(funcionario);
	}
}
