package LiskovSubstitutionPrinciple;

public class Kedi extends Hayvan implements ISesCikarabilme,IYuruyebilme, IZiplayabilme, ITirmanabilme{
	
	
	@Override
	public String getTurAdi() {
		// TODO Auto-generated method stub
		return "Kedi";
	}

	@Override
	public void setTurAdi(String turAdi) {
		// TODO Auto-generated method stub
		super.setTurAdi(turAdi);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	public String Tirmanabilme() {
		// TODO Auto-generated method stub
		return "Kedi Tirmandi";
	}

	@Override
	public String Ziplayabilme() {
		// TODO Auto-generated method stub
		return "Kedi Zipladi";
	}

	@Override
	public String Yuruyebilme() {
		// TODO Auto-generated method stub
		return "Kedi Yürüdü";
	}

	@Override
	public String SesCikarabilme() {
		// TODO Auto-generated method stub
		return "Kedi Konustu";
	}
	
}
