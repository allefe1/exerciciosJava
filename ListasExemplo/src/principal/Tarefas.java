package principal;

import java.util.ArrayList;
import java.util.Scanner;

public class Tarefas {
	public static void main(String[] args) {
		ArrayList<String> tarefas = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		int opcao;
		
		do {
			System.out.println("BEM VINDO AO GERENCIADOR DE TAREFAS:");
			System.out.println("----------------------------------");
			System.out.println("1- Adicionar tarefa");
			System.out.println("2- Remover tarefa");
			System.out.println("3- Visualizar tarefas");
			System.out.println("4- Marcar tarefa como Concluido");
			System.out.println("5- Sair");
			opcao = sc.nextInt();
			sc.nextLine();
			
			switch (opcao) {
			case 1:
				System.out.println("qual o nome da tarefa que deseja adicionar?");
				String tarefa = sc.nextLine();
				tarefas.add(tarefa);
				System.out.println("tarefa adicionada com sucesso!");
				System.out.println();
				break;
			case 2:
				System.out.println("qual o nome da tarefa que deseja remover?");
				tarefa = sc.nextLine();
				 if (tarefas.remove(tarefa)) {
                     System.out.println("Tarefa removida com sucesso!");
                     System.out.println();
                 } else {
                     System.out.println("Tarefa não encontrada!");
                     System.out.println();
                 }
				break;
			case 3:
				System.out.println("TAREFAS EXISTENTES:");
				System.out.println("------------------");
				if(tarefas.isEmpty()) {
					System.out.println("nenhuma tarefa cadastrada");
					System.out.println();
				}else {
					for(int i = 0; i < tarefas.size(); i++) {
						System.out.println((i+1) + " " + tarefas.get(i));
					}
					System.out.println();
				}
				break;
			case 4:
				
				System.out.println("qual o numero da tarefa que deseja marcar como conluido?");
				int indice = sc.nextInt();
				indice -= 1;
				if(indice >= 0 && indice < tarefas.size()) {
					String tarefaConcluida = tarefas.get(indice);
					tarefas.set(indice, tarefaConcluida + " (CONCLUÍDA)");
					System.out.println("Tarefa marcada como concluida");
					System.out.println();
				}else {
					System.out.println("tarefa nao encontrada");
					System.out.println();
				}
				break;
				
			case 5:
                System.out.println("Encerrando o programa... Até logo!");
                break;
                
			default:
                System.out.println("opcao nao e valida");
			}
			
			
		}while(opcao != 5);
		
		sc.close();

	}

}
