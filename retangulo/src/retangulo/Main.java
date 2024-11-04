package retangulo;

import java.util.Locale;
import java.util.Scanner;

import entities.Calculator;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Calculator retangulo = new Calculator();
		System.out.println("digite a largura e altura de um retangulo: ");
		retangulo.width = sc.nextDouble();
		retangulo.height = sc.nextDouble();
		System.out.printf("Area = %.2f%n", retangulo.Area());
		System.out.printf("Perimetro = %.2f%n", retangulo.Perimetro());
		System.out.printf("Diagonal = %.2f%n", retangulo.diagonal());
		
		
		sc.close();

	}

}
