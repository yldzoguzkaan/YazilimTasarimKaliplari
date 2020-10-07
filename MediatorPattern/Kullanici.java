package MediatorPattern;

public class Kullanici {
	private String KullaniciAdi;

	public String getKullaniciAdi() {
		return KullaniciAdi;
	}

	public void setKullaniciAdi(String kullaniciAdi) {
		KullaniciAdi = kullaniciAdi;
	}

	public Kullanici() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Kullanici(String kullaniciAdi) {
		super();
		KullaniciAdi = kullaniciAdi;
	}
	
	public void mesajGonder(String mesaj) {
		ChatOdasi.mesajiGoster(this, mesaj);
	}
}
