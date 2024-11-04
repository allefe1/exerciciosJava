package exercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<Pessoa> pessoas = new ArrayList<>();

		System.out.println("quanta pessoas serao digitadas? ");
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			System.out.println("Dados da " + (i + 1) + "pessoa: ");
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			float altura = sc.nextFloat();

			pessoas.add(new Pessoa(nome, idade, altura));
		}
		
		double somaAlturas = 0.0;
		int pessoasMenores16 = 0;
		List<String> nomesMenores16 = new ArrayList<>();
		
		for(Pessoa pessoa : pessoas) {
			somaAlturas += pessoa.getAltura();
			if(pessoa.getIdade() < 16) {
				pessoasMenores16++;
				nomesMenores16.add(pessoa.getNome());
			}
		}

		double alturaMedia = somaAlturas / num;
        float porcentagemMenores16 = (float) pessoasMenores16 / num * 100;
		
        
        System.out.printf("Altura média: %.2f\n", alturaMedia);

    
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", porcentagemMenores16);

       
        if (!nomesMenores16.isEmpty()) {
            for (String nome : nomesMenores16) {
                System.out.println(nome);
            }
        }
        
		sc.close();

	}

}
