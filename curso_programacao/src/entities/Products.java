package entities;

public class Products {
	public String name;
	public double price;
	public int quantity;
	
	
	public double TotalValueInStock() {
		return quantity * price;
	}
	
	public void AddProducts(int quantity) {
		this.quantity += quantity;
		
	}
	
	public void RemoveProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return name + ", $ " + price + ", " + quantity + " units, Total: $ " + TotalValueInStock();
	}
}
