package pensionato;

import java.util.Scanner;

public class Pensao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		

		Aluga[] vetor = new Aluga[10];
		
		System.out.println("quantos quartos serao alugados? ");
		int quarto = sc.nextInt();
		
		for(int i = 0; i < quarto; i++) {
			System.out.println("locatario " + (i+1) + ": ");
			System.out.println("Digite seu nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.println("digite seu email: ");
			String email = sc.next();
			System.out.println("digite o numero do quarto: ");
			int numQuarto = sc.nextInt();
			
			vetor[numQuarto] = new Aluga(nome, email);
			System.out.println();
		}
		
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i] != null) {
				System.out.println(i + ": " + vetor[i]);
			}
		}
		
		sc.close();

	}

}
