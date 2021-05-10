
public class KursManager {

	public KursManager() {
	}

	public void list(Gun[] gunler) {

		for (Gun gun : gunler) {
			System.out.println(gun.id + " ) " + gun.icerik + " " + gun.kayitLink);
		}
	}
	

}
