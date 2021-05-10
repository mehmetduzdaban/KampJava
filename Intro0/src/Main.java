
public class Main {

	public static void main(String[] args) {
		/*
		String internetsubebutonu ="Ýnternet Þubeye Gir:";
		System.out.println(internetsubebutonu);
		
		// if else yapýsý
		double dolardun=8.50;
		double dolarbugun=8.50;
		
		if(dolardun>dolarbugun) {
			System.out.println("Dolar kuru yükseliyor");
		}
		else if(dolardun<dolarbugun){
			System.out.println("Dolar kuru düþüyor");
		}
		else {
		System.out.println("Dolar kuru eþittir");
		}
			
			
		// for each döngüsü	
		System.out.println("for each döngüsü");
		
		String[] krediler = {
		"Meb Kredisi", 
		"Ýhtiyaç Kredisi",
		"Konut Kredisi",
		"Araç Kredisi",
		"Kültür Bakanlýðý Kredisi"
		};
		
		for(String kredi : krediler) {
			System.out.println(kredi);
			
		}
		
		*/
		
		
		//REFERANS DEÐER TÝPLERÝ
	
		int sayi1 = 10;
		int sayi2 = 50;
		sayi1=sayi2;
		sayi2=100;
		System.out.println(sayi2);
		
		
		int[] sayilar1 = {1,2,3,4};
		int[] sayilar2 = {10,20,30,40};
		sayilar1=sayilar2;
		sayilar2[0]=500;
		System.out.println(sayilar2[0]);
	}

}
