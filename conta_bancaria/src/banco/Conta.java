package banco;

public class Conta {
	private int numero;
	private String nome;
	private double depoInicial;
	
	public Conta(int numero, String nome, double depoInicial) {
		super();
		this.numero = numero;
		this.nome = nome;
		this.depoInicial = depoInicial;
	}
	
	public Conta(int numero, String nome) {
		super();
		this.numero = numero;
		this.nome = nome;
		depoInicial = 0;
	}
	
	public double depoInicial() {
		return depoInicial;
	}

	public int getNumero() {
		return numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void deposito(double valor) {
		depoInicial += valor;
	}
	
	public void status() {
		System.out.println("conta: " + this.numero + ", proprietario: " + this.nome + ", saldo: " + this.depoInicial);
	}
	
	public void saque(double valor) {
		depoInicial -= 5;
		depoInicial -= valor;
		
	}
}
