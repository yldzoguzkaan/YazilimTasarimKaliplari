package AdapterPattern;

public class AdapterPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SesOynatici so = new SesOynatici();
		so.oynat("MP3", "Gaye Su Akyol - Rüyalarda Buluþuruz.mp3");
		so.oynat("MP4", "Gaye Su Akyol - Cehennem Meyhanesi.mp4");
		so.oynat("VLC", "Gaye Su Akyol - Gamzendeyim Deva Bulmam.mp3");
		so.oynat("AVI", "Gaye Su Akyol - Rüyalarda Buluþuruz.mp3");
	}

}
