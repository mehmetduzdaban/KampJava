
public class Product {

	public Product() {
		System.out.println("Product ?al??t?");
	}

	public Product(int id, String name, double unitPrice, String detail) {
		this();
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
	}

	public int id;
	public String name;
	public double unitPrice;
	public String detail;

}
