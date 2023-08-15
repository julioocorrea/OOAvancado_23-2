package Aula1;
import java.util.Scanner;

public class Funcionario {
	protected double Salario;
	protected Cargo cargo;
	
	public Funcionario(double salario, Cargo cargo) {
		this.Salario = salario;
		this.cargo = cargo;
	}
	
	public double getSalario() {
		return this.Salario;
	}
	
	public Cargo getcargo() {
		return this.cargo;
	}
	
	public void setSalario(double salario) {
        this.Salario = salario;
	}
	
	public void setcargo(Cargo cargo) {
        this.cargo = cargo;
	}
	
}
