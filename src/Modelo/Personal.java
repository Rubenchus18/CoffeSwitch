package Modelo;

public class Personal {
	private String nombre;
	private String contraseña;
	private Double propina;
	public Personal(String nombre, String contraseña, Double propina) {
		super();
		this.nombre = nombre;
		this.contraseña = contraseña;
		this.propina = propina;
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
	public Double getPropina() {
		return propina;
	}
	public void setPropina(Double propina) {
		this.propina = propina;
	}
	@Override
	public String toString() {
		return "Personal [nombre=" + nombre + ", contraseña=" + contraseña + ", propina=" + propina + "]";
	}
	
	
}
