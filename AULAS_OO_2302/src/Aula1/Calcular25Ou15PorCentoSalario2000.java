package Aula1;

public class Calcular25Ou15PorCentoSalario2000 implements RegraCalculo {

	@Override
	public double calcular(Funcionario funcionario) {
		if (funcionario.getSalario() > 2000) {
			return funcionario.getSalario() * 0.75;
		}
		else {
			return funcionario.getSalario() * 0.85;
		}
	}

}
