package pensionato;

public class Aluga {
	private String email;
	private String nome;

	public Aluga(String email, String nome) {
		this.email = email;
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return nome + ", " + email;
	}
	
	
	
	
	
}
