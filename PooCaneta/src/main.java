import entities.Caneta;

public class main {

	public static void main(String[] args) {
		Caneta  caneta1 = new Caneta("compactor", "azul", 0.7f, 10, true);
		caneta1.tampar();
		
		caneta1.status();
		caneta1.escrever();
		caneta1.destampar();
		caneta1.escrever();
		
		Caneta caneta2 = new Caneta("BIC", "Preta", 0.5f, 100, true);
        caneta2.destampar();
        
        caneta2.status();
	}

}
