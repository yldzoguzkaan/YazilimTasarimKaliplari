package LiskovSubstitutionPrinciple;

public class Maymun extends Hayvan implements ISesCikarabilme,IYuruyebilme, IZiplayabilme, ITirmanabilme {
	
	@Override
	public String getTurAdi() {
		// TODO Auto-generated method stub
		return "Maymun";
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
		return "Maymun Tirmandi";
	}

	@Override
	public String Ziplayabilme() {
		// TODO Auto-generated method stub
		return "Maymun Zipladi";
	}

	@Override
	public String Yuruyebilme() {
		// TODO Auto-generated method stub
		return "Maymun Yurudu";
	}

	@Override
	public String SesCikarabilme() {
		// TODO Auto-generated method stub
		return "Maymun Ses Cikardi";
	}
}
