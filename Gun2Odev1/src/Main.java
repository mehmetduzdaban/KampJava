
public class Main {

	public static void main(String[] args) {
		Kurs kurs = new Kurs(1, "Java");

		Gun gun1 = new Gun(1, kurs.id, "JAVA Temelleri 1", "https://youtu.be/HB0T0hAMk0k",
				"veri tiplerini araþtýrýnýz.", "programýmýzý nasýl buldunuz?");
		Gun gun2 = new Gun(2, kurs.id, "JAVA Temelleri 2", "https://youtu.be/zwPQsIpTrH8",
				"24-35 aralýðýnda izleyiniz.", "programýmýzý nasýl buldunuz?");

		
		Gun[] gunler = { gun1, gun2 };

		KursManager kursManager = new KursManager();
		kursManager.list(gunler);
	}

}
