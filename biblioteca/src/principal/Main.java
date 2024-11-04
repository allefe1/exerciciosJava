package principal;
import java.util.ArrayList;
import java.util.Scanner;
import recursos.Recursos;


public class Main {

	public static void main(String[] args) {
		ArrayList <Recursos> livros = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int opcao = 0;
		
		
		do {
			System.out.println("BEM VINDO AO GERENCIADOR DA BIBLIOTECA:");
			System.out.println("----------------------------------");
			System.out.println("1- Adicionar LIVRO");
			System.out.println("2- Listar todos os cadastrados");
			System.out.println("3- Buscar um livro pelo nome");
			System.out.println("4- Remover um livro pelo nome");
			System.out.println("5- Sair do programa");
			opcao = sc.nextInt();
			sc.nextLine();
			
			switch (opcao) {
				case 1:
					System.out.println("digite o nome do livro que deseja adicionar: ");
					String nome = sc.nextLine();
					System.out.println("digite o nome do autor do livro: ");
					String autor = sc.nextLine();
					System.out.println("digite o ano do livro: ");
					int ano = sc.nextInt();
					livros.add(new Recursos(nome, autor, ano));
					break;
				case 2:
					if(livros.isEmpty()) {
						System.out.println("nao existem livros cadastrados");
					}else {
						for(Recursos recursos: livros) {
							System.out.println(recursos);
						}
					}
					break;
				case 3:
					System.out.println("digite o nome do livro que deseja buscar: ");
					String busca = sc.nextLine();
					boolean encontrado = false;
					for(Recursos recursos: livros) {
						if(recursos.getNome().equalsIgnoreCase(busca)) {
							System.out.println("livro encontrado" + recursos);
							encontrado = true;
							break;
						}
					}if(!encontrado) {
						System.out.println("Livro não encontrado.");
					}
					break;
				case 4:
					System.out.print("Digite o nome do livro para remover: ");
                    String nomeRemover = sc.nextLine();
                    boolean removido = livros.removeIf(recursos -> recursos.getNome().equalsIgnoreCase(nomeRemover));
                    if (removido) {
                        System.out.println("Livro removido com sucesso!");
                    } else {
                        System.out.println("Livro não encontrado.");
                    }
					break;
				case 5:
					System.out.println("Saindo do programa...");
					break;
				default:
					System.out.println("Opção inválida. Tente novamente.");
			}
			
			
		}while(opcao != 5);
		
		sc.close();
		
		
	}

}
