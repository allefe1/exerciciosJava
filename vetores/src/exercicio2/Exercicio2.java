package exercicio2;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("quantos numeros voce vai digitar? ");
		int num = sc.nextInt();
		double soma = 0, media = 0;
		
		float[] vetor = new float[num];
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.println("digite o " + (i+1) + " numero: " );
			float num1 = sc.nextFloat();
			vetor[i] = num1;
			
		}
		
		for (int i = 0; i < vetor.length; i++) {
			soma += vetor[i];
		}
		
		for (int i = 0; i < vetor.length; i++) {
			media += vetor[i];
		}
		
		System.out.print("VALORES = ");
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
			
		}
		System.out.println();
		System.out.println("SOMA = " + soma);
		System.out.println("MEDIA = " + (media/num));
		
		
		sc.close();
	

	}

}
