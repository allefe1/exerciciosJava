package principal;

import java.util.Scanner;

import banco.Conta;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("digite o numero da conta: ");
		int numero = sc.nextInt();
		System.out.println("digite o nome do propietario da conta: ");
		String nome = sc.next();
		System.out.println("deseja realizar um deposito inicial? (s) para sim e (n) para nao ");
		char opcao = sc.next().charAt(0);
		
		if(opcao == 's') {
			System.out.println("quanto deseja depositar inicialmente? ");
			double depoInicial = sc.nextDouble();
			Conta conta1 = new Conta(numero, nome, depoInicial);
			conta1.status();
			System.out.println("quanto voce deseja depositar? ");
			double valor = sc.nextDouble();
			conta1.deposito(valor);
			conta1.status();
			System.out.println("agora vamos realizar um saque! ");
			System.out.println("quanto voce deseja sacar? ");
			valor = sc.nextDouble();
			conta1.saque(valor);
			conta1.status();
		}else {
			Conta conta1 = new Conta(numero, nome);
			conta1.status();
			System.out.println("quanto voce deseja depositar? ");
			double valor = sc.nextDouble();
			conta1.deposito(valor);
			conta1.status();
			System.out.println("agora vamos realizar um saque! ");
			System.out.println("quanto voce deseja sacar? ");
			valor = sc.nextDouble();
			conta1.saque(valor);
			conta1.status();
		}
		
		sc.close();
	}
}
