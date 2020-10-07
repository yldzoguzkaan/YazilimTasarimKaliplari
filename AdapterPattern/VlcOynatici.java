package AdapterPattern;

public class VlcOynatici implements GelismisMedyaOynatici {

	@Override
	public void oynatVlc(String dosyaAdi) {
		System.out.println(dosyaAdi + " adli VLC dosyasi calinmaktadir.");
		
	}

	@Override
	public void oynatMp4(String dosyaAdi) {
		
	}
	
}
