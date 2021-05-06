
public class main {

	public static void main(String[] args) {
		
		System.out.println("Toplama İşlemi");
		int sayi1 = 40; 
		int sayi2 = 20;
		
		int sayi3 = sayi1 + sayi2;
		System.out.println("Sayi1 ve Sayi2 Toplamı =" +sayi3);
		
		if(sayi1>sayi2)
		{
			System.out.println("sayi1,sayi2den büyüktür.");
		}else {
			System.out.println("sayi1,sayi2den küçüktür.");			
		}
	
		// BÜYÜK-KÜÇÜK HARF DUYARLILIĞI VAR
		int Grade = 'D';
		
		switch (Grade) {
		case 'A':
			System.out.println("Mükemmel Başarılı");	
			break;
		case 'B':
			System.out.println("Güzel Başarılı");	
			break;
		case 'C':
			System.out.println("İyi Geçtiniz");	
			break;
		case 'D':
			System.out.println("Kaldınız");	
			break;
		default:
			
		}
		
	}

}
