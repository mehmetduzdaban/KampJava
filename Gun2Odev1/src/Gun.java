
public class Gun {

	public Gun() {

	}

	public Gun(int id, int kursId, String icerik, String kayitLink, String odev, String degerlendirme) {
		super();
		this.id = id;
		this.kursId = kursId;
		this.icerik = icerik;
		this.kayitLink = kayitLink;
		this.odev = odev;
		this.degerlendirme = degerlendirme;
	}

	public int id;
	public int kursId;
	public String icerik;
	public String kayitLink;
	public String odev;
	public String degerlendirme;
}
