import java.util.Scanner;

import entities.Products;



public class Main {
	
	public static void main(String[] args) {
		Products produto = new Products();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("cadastro de produtos: ");
		System.out.println("digite o nome do produto: ");
		produto.name = sc.nextLine();
		System.out.println("digite a quantidade do produto: ");
		produto.quantity = sc.nextInt();
		System.out.println("digite o preco do produto: ");
		produto.price = sc.nextDouble();
		
		System.out.println(produto);
		System.out.println();
		System.out.println("entre com o numero de produtos para serem adicionados no stock: ");
		int products = sc.nextInt();
		produto.AddProducts(products);
		System.out.println("dados atualizados" + produto);
		
		System.out.println();
		System.out.println("entre com o numero de produtos para serem removidos no stock: ");
		int remover = sc.nextInt();
		produto.RemoveProducts(remover);
		
		System.out.println("dados atualizados" + produto);
		sc.close();
	
}
}