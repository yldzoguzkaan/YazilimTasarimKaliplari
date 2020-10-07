package IteratorPattern;

public class Shape {
	private int ID;
    private String name;
     
    public Shape(int id, String name){
        this.ID = id;
        this.name = name;
    }
     
    public int getId() {
        return ID;
    }
    public void setId(int id) {
        this.ID = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
     
    @Override
    public String toString(){
        return "ID: "+ID+" Shape: "+name;
    }
}
