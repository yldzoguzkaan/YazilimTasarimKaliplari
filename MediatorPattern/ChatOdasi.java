package MediatorPattern;

import java.util.Date;

public class ChatOdasi {
	public static void mesajiGoster(Kullanici kullanici, String mesaj) {
		System.out.println(new Date().toString() + " [" + kullanici.getKullaniciAdi() + "] : " + mesaj);
	}
}
