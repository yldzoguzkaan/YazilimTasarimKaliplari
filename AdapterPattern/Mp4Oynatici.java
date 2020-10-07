package AdapterPattern;

public class Mp4Oynatici implements GelismisMedyaOynatici {

	@Override
	public void oynatVlc(String dosyaAdi) {
	}

	@Override
	public void oynatMp4(String dosyaAdi) {
		System.out.println(dosyaAdi + " adli MP4 dosyasi calinmaktadir.");
	}
	
}
