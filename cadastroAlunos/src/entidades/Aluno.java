package entidades;

public class Aluno {
	private String nome;
	private int matricula;
	private float nota1;
	private float nota2;
	private float nota3;
	private float media;
	private String situacao;
	
	
	
	public Aluno(String nome, int matricula, float nota1, float nota2, float nota3) {
		this.nome = nome;
		this.matricula = matricula;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
	}
	
	public Aluno() {
		
	}

	public void setNome(String novoNome) {
		this.nome = novoNome;
	}
	
	public void setMatricula(int novaMat) {
		this.matricula = novaMat;
	}
	
	public void setNotas(float nota1, float nota2, float nota3) {
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
	}
	
	public void calcularMedia() {
		media = nota1 + nota2 + nota3 / 3;
	}
	
	public boolean buscarAluno(int matricula) {
		return this.matricula == matricula;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public int getMatricula() {
		return this.matricula;
	}
	
	public float getNota1() {
		return this.nota1;
	}
	
	public float getNota2() {
		return this.nota2;
	}
	
	public float getNota3() {
		return this.nota3;
	}
	
	public String situacao() {
		definirSituacao();
		return situacao;
	}
	
	private void definirSituacao() {
		if(media >= 7) {
			situacao = "aprovado";
		} else if (media >= 5 && media < 7) {
			situacao = "recuperacao";
		} else {
			situacao = "reprovado";
		}
	}
	
	
	public String alterarNota(int codNota, float valorNota) {
		switch (codNota) {
			case 1:
				this.nota1 = valorNota;
				break;
			case 2:
				this.nota2 = valorNota;
				break;
			case 3:
				this.nota3 = valorNota;
		}
		
		return situacao;
	}
	
	public String toString() {
        return "Aluno [Nome=" + nome + ", Matrícula=" + matricula + 
               ", Nota1=" + nota1 + ", Nota2=" + nota2 + ", Nota3=" + nota3 + "]";
    }
	
	
}
