package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Aluno;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List <Aluno> list = new ArrayList<>();
		int opcao = 0;
		
		Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        Aluno a3 = new Aluno();
		
		
		do {
			System.out.println("----------------------------");
			System.out.println("MENU PRINCIPAL");
			System.out.println("----------------------------");
			System.out.println("1- CADASTRAR ALUNOS");
			System.out.println("2- CADATRAR NOTAS");
			System.out.println("3- CALCULAR MEDIAS");
			System.out.println("4- INFORMAR SITUACOES");
			System.out.println("5- INFORMAR DADOS DE UM ALUNO");
			System.out.println("6- ALTERAR NOTA");
			System.out.println("7- Sair");
			System.out.println("----------------------------");
			
			opcao = sc.nextInt();
			
			switch (opcao){
			
			case 1:
				System.out.println("Quantos alunos deseja cadastrar?");
                int quantidade = sc.nextInt();

                for (int i = 0; i < quantidade; i++) {
                    sc.nextLine();
                    System.out.println("Cadastro do Aluno #" + (i + 1));

                    System.out.print("Nome: ");
                    String nome = sc.nextLine();

                    System.out.print("Matrícula: ");
                    int matricula = sc.nextInt();

                    Aluno aluno = new Aluno();
                    aluno.setNome(nome);
                    aluno.setMatricula(matricula);

                    list.add(aluno);
                    System.out.println("Aluno cadastrado com sucesso!\n");
                }
                break;
			case 2:
				System.out.println("digite a matricula do aluno que deseja cadastrar as notas: ");
				int matricula = sc.nextInt();
				
				Aluno aluno = buscarAlunoPorMatricula(list, matricula);
				if(aluno != null) {
		            System.out.print("Digite a 1ª nota: ");
		            float nota1 = sc.nextFloat();

		            System.out.print("Digite a 2ª nota: ");
		            float nota2 = sc.nextFloat();

		            System.out.print("Digite a 3ª nota: ");
		            float nota3 = sc.nextFloat();

		            aluno.setNotas(nota1, nota2, nota3);
		            System.out.println("Notas cadastradas com sucesso!\n");
		        } else {
		            System.out.println("Aluno não encontrado!\n");
		        }
				break;
			}
			
		}while(opcao != 7);
		
		
		
		sc.close();

	}
	public static Aluno buscarAlunoPorMatricula(List <Aluno> list, int matricula) {
		for(Aluno aluno: list) {
			 if (aluno.getMatricula() == matricula) {
		            return aluno;
		}
	}
		return null;
	}
}
