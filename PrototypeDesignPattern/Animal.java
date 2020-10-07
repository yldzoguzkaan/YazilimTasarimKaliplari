package PrototypeDesignPattern;

public abstract class Animal {
	private String id;
	protected String Type;
	
	abstract void talk();

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}
	
	public abstract Animal clone();
}
