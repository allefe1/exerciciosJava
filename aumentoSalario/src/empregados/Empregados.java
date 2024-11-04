package empregados;

public class Empregados {
	private int id;
	private String nome;
	private float salario;
	
	
	public Empregados(int id, String nome, float salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public float getSalario() {
		return salario;
	}


	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	public void aumentarSalario(float porcentagem) {
		this.salario += salario * (porcentagem / 100);
	}


	@Override
	public String toString() {
		return "Lista de Empregados [id= " + id + ", nome= " + nome + ", salario= " + salario + "]";
	}
	
	
	
}
