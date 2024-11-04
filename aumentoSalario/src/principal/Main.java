package principal;

import java.util.ArrayList;
import java.util.Scanner;

import empregados.Empregados;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList <Empregados> funcionarios = new ArrayList<>();
		System.out.println("Quantos funcionarrios deseja adicionar? ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.println("Funcionario #" + (i+1));
			System.out.println("id: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.println("nome: ");
			String nome = sc.nextLine();
			System.out.println("salario: ");
			float salario = sc.nextFloat();
			funcionarios.add(new Empregados(id, nome, salario));
			System.out.println("Funcionario cadastrado com sucesso!");
		}
		
		for(Empregados x: funcionarios) {
			System.out.println(x);
		}
		
		System.out.println("entre com o id do empregado que deseja aumentar o salario: ");
		int id = sc.nextInt();
		System.out.println("entre com a porcentagem que deseja aumentar no salario dele: ");
		float porcentagem = sc.nextFloat();
		Empregados empId = buscarFuncionarioPorId(funcionarios, id);
		if(empId != null) {
			empId.aumentarSalario(porcentagem);
			System.out.println("salario aumentado com sucesso!");
		}else {
			System.out.println("Funcionário com ID " + id + " não encontrado.");
		}
		
		
		for (Empregados emp : funcionarios) {
		    System.out.println(emp);
		}
		
		sc.close();
	}

	public static Empregados buscarFuncionarioPorId(ArrayList<Empregados> funcionarios, int id) {
		for(Empregados x: funcionarios) {
			if(x.getId() == id) {
				return x;
			}
		}
		return null;
	}
}