
public class Main {

	public static void main(String[] args) {
		/*
		String internetsubebutonu ="�nternet �ubeye Gir:";
		System.out.println(internetsubebutonu);
		
		// if else yap�s�
		double dolardun=8.50;
		double dolarbugun=8.50;
		
		if(dolardun>dolarbugun) {
			System.out.println("Dolar kuru y�kseliyor");
		}
		else if(dolardun<dolarbugun){
			System.out.println("Dolar kuru d���yor");
		}
		else {
		System.out.println("Dolar kuru e�ittir");
		}
			
			
		// for each d�ng�s�	
		System.out.println("for each d�ng�s�");
		
		String[] krediler = {
		"Meb Kredisi", 
		"�htiya� Kredisi",
		"Konut Kredisi",
		"Ara� Kredisi",
		"K�lt�r Bakanl��� Kredisi"
		};
		
		for(String kredi : krediler) {
			System.out.println(kredi);
			
		}
		
		*/
		
		
		//REFERANS DE�ER T�PLER�
	
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
