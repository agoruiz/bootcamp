import java.io.Serializable;

public class persona implements Serializable {
	private int Edad;
	private String Nombre;
	private String Apellidos;

	public int getEdad() {
		return Edad;
	}
	
	persona(String nombre, String apellidos){
		this.Nombre = nombre;
		this.Apellidos = apellidos;
	}
	
	persona(String nombre, String apellidos,int edad){
		this.Nombre = nombre;
		this.Apellidos = apellidos;
		this.Edad = edad;
	}
	
	public void setEdad(int edad) {
		Edad = edad;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellidos() {
		return Apellidos;
	}
	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}
	

}
