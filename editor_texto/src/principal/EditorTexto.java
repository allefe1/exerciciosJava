package principal;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;


public class EditorTexto {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		boolean sair = false;
		while(!sair) {
			menu();
			int opcao = sc.nextInt();
			sc.nextLine();
			
			switch (opcao) {
				case 1:
					System.out.println("Coloque o nome do arquivo: ");
					String newFileName = sc.nextLine();
					createFile(newFileName);
					break;
					
				case 2:
					System.out.println("Digite o nome do arquivo que deseja abrir: ");
					String openFileName = sc.nextLine();
					openFile(openFileName);
					break;
					
				case 3:
					System.out.println("Digite o nome do arquivo para editar: ");
					String editFileName = sc.nextLine();
					editFile(editFileName);
					break;
					
				case 4:
					System.out.println("Digite o nome do arquicvo para salvar: ");
					String saveFileName = sc.nextLine();
					saveFile(saveFileName);
					break;
					
				case 5:
					sair = true;
					break;
					
				default:
					System.out.println("voce digitou uma opcao invalida: ");
				    break;
			}
		}
		
		sc.close();

	}
	
	private static void createFile(String fileName) {
		try {
			File file = new File(fileName);
			if (file.createNewFile()) {
				System.out.println("Arquivo criado: " + file.getName());
				System.out.println();
			} else {
				System.out.println("Arquivo já existe.");
				System.out.println();
			}
		} catch (IOException e) {
			System.out.println("Um erro ocorreu.");
			System.out.println();
			e.printStackTrace();
		}
	}
	
	private static void openFile(String fileName) {
		try {
			String content = new String(Files.readAllBytes(Paths.get(fileName)));
			System.out.println("conteudo do arquivo: ");
			System.out.println(content);
			System.out.println();
		} catch (IOException e) {
			System.out.println("ocorreu um erro.");
			e.printStackTrace();
		}
	}
	
	private static void editFile(String fileName) {
		try {
			Scanner sc = new Scanner (System.in);
			System.out.println("entre com o novo conteudo do arquivo: ");
			String newContent = sc.nextLine();
			sc.close();
			FileWriter writer = new FileWriter(fileName, true);
			writer.write(newContent);
			writer.close();
			System.out.println("Arquivo Editado.");	
			System.out.println();
		}catch (IOException e) {
			System.out.println("aconteceu um erro.");
			System.out.println();
			e.printStackTrace();
		}
	}
	
	private static void saveFile(String fileName) {
		System.out.println("arquivo salvo");
		System.out.println();
	}
	
	
	
	public static void menu () {
		System.out.println("Editor de Textos");
		System.out.println("1: criar novo arquivo");
		System.out.println("2: abrir arquivo existente");
		System.out.println("3: editar arquivo");
		System.out.println("4: salvar arquivo");
		System.out.println("5: sair");
		System.out.println();
		System.out.println("Escolha uma opcao: ");
		System.out.println();
	}
}



