
public class Main {

	public static void main(String[] args) {
			
		//ders 31
		DortIslem dort�slem = new DortIslem();
		int sonuc = dort�slem.Topla(5, 10);
		System.out.println(sonuc);
		System.out.println("-----DERS 31 SONU----");
		
		
		
		//ders 32-33-34
		Product product = new Product();
		product.setId(51);
		product.setName("Masa�st�");
		product.setDescription("Casper");
		product.setPrice(5000);
		product.setStockAmount (3);
	
		ProductManager productManager = new ProductManager();
		productManager.add(product);
				
		System.out.println(product.getKod());
		System.out.println("-----DERS 32.33.34.35 SONU----");
				
		
	
	}

}
