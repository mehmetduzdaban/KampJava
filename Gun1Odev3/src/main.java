
public class main {

	public static void main(String[] args) {
		/*
		System.out.println("Toplama İşlemi");
		int sayi1 = 40; 
		int sayi2 = 20;
		
		int sayi3 = sayi1 + sayi2;
		System.out.println("Sayi1 ve Sayi2 Toplamı =" +sayi3);
		
		// if-else
		if(sayi1>sayi2)
		{
			System.out.println("sayi1,sayi2den büyüktür.");
		}else {
			System.out.println("sayi1,sayi2den küçüktür.");			
		}
	
		
		
		// switch case
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
			System.out.println("Kaldınız İyi Çalışmalısın ");	
			break;
		default:
			
		}
		
		
		// for döngüsü
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
		System.out.println("Döngü Bitti ");
		
		
		//do while
		
		int j=1;
 	   do{
 		   System.out.println("Loglandı");
 		   System.out.println(j);
 		   j+=2;
 	   	}while(j<10);
		
 	   
 	   
 	   */
 	   
		System.out.println("diziler başlangıç");
 	   
 	   	String yazar1="Namık KEMAL";
 	   	String yazar2="Şinasi";
 	   	String yazar3="Mehmet Akif ERSOY";
 	   
 	   	System.out.println(yazar1);
 	   	System.out.println(yazar2);
 	   	System.out.println(yazar3);
 	   
 	   	
 	   System.out.println("<------DİZİLER------>");
 	   
 	   	String yazarlar[] = new String[5];
 	   	
 	   	yazarlar[0]="Namık KEMAL"; 
 	   	yazarlar[1]="Şinasi"; 	
 	   	yazarlar[2]="Mehmet Akif ERSOY"; 	
 	   	yazarlar[3]="Cemal AYTEKİN"; 	
 	   	
 	   	for(int i=0; i<(yazarlar.length-1);i++) {
 	   	System.out.println(yazarlar[i]);
 	   	
 	   	}
 	   	
 	   	
 	   	
 	   double [] numberlist= {1.2,1.3,1.4,5.6}; 
	   double total=0;
	   double max=numberlist[0];
	   for(double sayi:numberlist) {
		   total+=sayi;
		   if(max<sayi) {
			   max=sayi;
		   }
	   }
	   System.out.println("Toplam:"+total);
	   System.out.println("Büyük sayı : "+max);
 	   	
	   
	   System.out.println("<------ÇOK BOYUTLU DİZİLER------>");
	   
	   
	   String [][] sehirler=new String[3][3];
	   sehirler[0][0]="İstanbul";
	   sehirler[0][1]="Bursa";
	   sehirler[0][2]="Bilecik";
	   sehirler[1][0]="Ankara";
	   sehirler[1][1]="Konya";
	   sehirler[1][2]="Kayseri";
	   sehirler[2][0]="Diyarbakır";
	   sehirler[2][1]="ŞanlıUrfa";
	   sehirler[2][2]="Gaziantep";
	   for(int i=0;i<=2;i++) {
		   System.out.println("---iç içe döngüler---");
		   for(int j=0;j<=2;j++) {
			   System.out.println(sehirler[i][j]);
		   }
	   }
	   
	   
	}
	
	
	
	

}
