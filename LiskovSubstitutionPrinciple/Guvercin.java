package LiskovSubstitutionPrinciple;

public class Guvercin extends Hayvan implements ISesCikarabilme, IYuruyebilme, IUcabilme, IZiplayabilme {

	@Override
	public String Ziplayabilme() {
		// TODO Auto-generated method stub
		return "Guvercin Zipladi";
	}

	@Override
	public String Ucabilme() {
		// TODO Auto-generated method stub
		return "Guvercin Uctu";
	}

	@Override
	public String Yuruyebilme() {
		// TODO Auto-generated method stub
		return "Guvercin Yurudu";
	}

	@Override
	public String SesCikarabilme() {
		// TODO Auto-generated method stub
		return "Guvercin Ses Cikardi";
	}

	@Override
	public String getTurAdi() {
		// TODO Auto-generated method stub
		return "Guvercin";
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
	
}
