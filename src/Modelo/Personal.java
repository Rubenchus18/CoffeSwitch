package Modelo;

public class Personal {
	private String nombre;
	private String contraseña;
	private int propina;
	public Personal(String nombre, String contraseña, int propina) {
		super();
		this.nombre = nombre;
		this.contraseña = contraseña;
		this.propina = propina;
	}
	public Personal(String nombre, String contraseña) {
		super();
		this.nombre = nombre;
		this.contraseña = contraseña;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	public int getPropina() {
		return propina;
	}
	public void setPropina(int propina) {
		this.propina = propina;
	}
	@Override
	public String toString() {
		return "Personal [nombre=" + nombre + ", contraseña=" + contraseña + ", propina=" + propina + "]";
	}
	
	
}
