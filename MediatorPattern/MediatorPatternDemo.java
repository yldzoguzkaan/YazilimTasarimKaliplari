package MediatorPattern;

public class MediatorPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kullanici oky = new Kullanici("OKY");
		Kullanici can = new Kullanici("CAN");
		
		oky.mesajGonder("Naber");
		can.mesajGonder("Ýyidir.");
	}

}
