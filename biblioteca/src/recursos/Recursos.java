package recursos;

public class Recursos {
	private String nome;
	private String autor;
	private int ano;
	
	
	public Recursos(String nome, String autor, int ano) {
		this.nome = nome;
		this.autor = autor;
		this.ano = ano;
	}


	@Override
	public String toString() {
		return "Livro [nome=" + nome + ", autor=" + autor + ", ano=" + ano + "]";
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
}
