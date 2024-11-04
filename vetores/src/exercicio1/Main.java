package exercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("digite quantos numeros voce vai digitar: ");
		int num = sc.nextInt();
		int[] vetor = new int[num];
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("digite o " + (i+1) + "º numero: ");
			num = sc.nextInt();
			vetor[i] = num;
		}
		
		System.out.println("NUMEROS NEGATIVOS:");
		
		for (int i = 0; i < vetor.length; i++) {
			if(vetor[i] < 0) {
				System.out.println(vetor[i]);
			}
		}
		
		sc.close();

	}

}
