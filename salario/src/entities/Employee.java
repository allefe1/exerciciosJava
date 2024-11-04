package entities;

public class Employee {
	private String name;
	private Double salarioBruto;
	private double Tax;
	
	public Employee (String name, double salarioBruto, double Tax) {
		this.name = name;
		this.salarioBruto = salarioBruto;
		this.Tax = Tax;
	}
	
	public Employee (String name, double salarioBruto) {
		this.name = name;
		this.salarioBruto = salarioBruto;
		Tax = 0;
	}
	
	public String getName() {
		return name;
	}
	
	
	public Double getSalarioBruto() {
		return salarioBruto;
	}

	public void setSalarioBruto(Double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}

	public double NetSalary() {
		return salarioBruto - Tax;
		
	}
	
	public void IncreaseSalary(double porcento) {
		salarioBruto += salarioBruto * porcento / 100;
	}
}
