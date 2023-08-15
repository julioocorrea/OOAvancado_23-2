package Aula1;

public class Calcular10Ou20PorCentoSalario3000 implements RegraCalculo {

	@Override
	public double calcular(Funcionario funcionario) {
		if (funcionario.getSalario() > 3000) {
			return funcionario.getSalario() * 0.80;
		}
		else {
			return funcionario.getSalario() * 0.90;
		}
	}
	
}
