package entities;

public class Caneta {
	public String modelo;
	public String cor;
	public float ponta;
	public int carga;
	public boolean tampada;
	
	
	
	public Caneta(String modelo, String cor, float ponta, int carga, boolean tampada) {
		this.modelo = modelo;
		this.cor = cor;
		this.ponta = ponta;
		this.carga = carga;
		this.tampada = tampada;
	}

	public void status() {
		System.out.println("o modelo da caneta e: " + this.modelo);
		System.out.println("a cor da caneta e: " + this.cor);
		System.out.println("a ponta da caneta e: " + this.ponta);
		System.out.println("a carga da caneta e: " + this.carga);
		System.out.println("esta tampada? " + this.isTampada());
	}
	
	public void escrever() {
		if(this.isTampada() == true) {
			System.out.println("erro, nao posso escrever, estou tampada");
		}else {
			System.out.println("estou escrevendo...");
		}
	}
	
	public void tampar() {
		this.tampada = true;
	}
	public void destampar() {
		this.tampada = false;
	}
	public boolean isTampada(){
		return this.tampada;
	}
	
	public void setModelo(String modelo) {
	    this.modelo = modelo;
	}

	public void setCor(String cor) {
	     this.cor = cor;
	}

	public void setPonta(float ponta) {
	     this.ponta = ponta;
	}

	public void setCarga(int carga) {
	     this.carga = carga;
	}
}

