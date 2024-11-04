package salario;

import java.util.Scanner;

import entities.Employee;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("digite o nome, salario bruto e imposto: ");
		
		String name = sc.next();
		double salarioBruto = sc.nextDouble();
		double Tax = sc.nextDouble();
		
		Employee funcionario = new Employee(name, salarioBruto, Tax);
		
		System.out.println("o funcionario: " + funcionario.getName() + " , $ " + funcionario.NetSalary());
		
		System.out.println("qual a porcentagem que deseja acrescentar no salario: ");
		double porcentagem = sc.nextDouble();
		funcionario.IncreaseSalary(porcentagem);
		
		System.out.println("dados atualizados: " + funcionario.getName() + " , $ " + funcionario.NetSalary());
		
		sc.close();
	}

}
