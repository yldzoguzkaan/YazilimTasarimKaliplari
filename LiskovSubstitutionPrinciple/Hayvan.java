package LiskovSubstitutionPrinciple;

public abstract class Hayvan {
	private String turAdi;

	public Hayvan(String turAdi) {
		super();
		this.turAdi = turAdi;
	}

	public Hayvan() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getTurAdi() {
		return turAdi;
	}

	public void setTurAdi(String turAdi) {
		this.turAdi = turAdi;
	}

	@Override
	public String toString() {
		return "Hayvan [turAdi=" + turAdi + "]";
	}
}
