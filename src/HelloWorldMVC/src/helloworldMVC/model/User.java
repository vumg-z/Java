package helloworldMVC.model;

public class User {
	
	private String nombre = ""; 
	private int id = 0; 
	
	
	//constructor
	public User(int id, String nombre ) {
		this.id = id;
		this.nombre = nombre;
	}
	
	public String getNombre(){
		return this.nombre;
	}
	
	public int getId() {
		return this.id;
	}
	
}
