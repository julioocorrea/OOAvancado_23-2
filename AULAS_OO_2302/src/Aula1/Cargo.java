package Aula1;

import java.util.Scanner;

public enum Cargo {
	Desenvolvedor(new Calcular10Ou20PorCentoSalario3000()),
	DBA(new Calcular25Ou15PorCentoSalario2000()),
	Tester(new Calcular25Ou15PorCentoSalario2000());
	
	Cargo(RegraCalculo regraCalculo) {
		this.regraCalculo = regraCalculo;
	}
	
	private RegraCalculo regraCalculo;
	
	public RegraCalculo getRegraCalculo() {
		return regraCalculo;
	}
	
	
}
