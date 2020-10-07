package AdapterPattern;

public class MedyaAdaptor implements MedyaOynatici{
	GelismisMedyaOynatici gmo;
	
	public MedyaAdaptor(String dosyaTipi) {
		if(dosyaTipi.equalsIgnoreCase("VLC")) {
			gmo = new VlcOynatici();
		}else if(dosyaTipi.equalsIgnoreCase("MP4")) {
			gmo = new Mp4Oynatici();
		}
	}
	@Override
	public void oynat(String dosyaTipi, String dosyaAdi) {
		if(dosyaTipi.equalsIgnoreCase("VLC")) {
			gmo.oynatVlc(dosyaAdi);
		}else if(dosyaTipi.equalsIgnoreCase("MP4")) {
			gmo.oynatMp4(dosyaAdi);
		}
	}
	
}
