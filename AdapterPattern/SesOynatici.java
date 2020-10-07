package AdapterPattern;

public class SesOynatici implements MedyaOynatici{
	MedyaOynatici ma;
	
	@Override
	public void oynat(String dosyaTipi, String dosyaAdi) {
		if(dosyaTipi.equalsIgnoreCase("MP3")) {
			System.out.println(dosyaAdi + " adli MP3 dosyasi calinmaktadir.");
		}else if(dosyaTipi.equalsIgnoreCase("VLC") || dosyaTipi.equalsIgnoreCase("MP4")) {
			ma = new MedyaAdaptor(dosyaTipi);
			ma.oynat(dosyaTipi, dosyaAdi);
		}else {
			System.out.println("Tanimlanamayan Medya." + dosyaTipi + " formati desteklenemiyor.");
		}
	}
	
}
