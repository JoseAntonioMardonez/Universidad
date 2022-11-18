import java.util.ArrayList;

public class Facultad {
	private String nombre;
	private String ubicacionGeografica;
	public ArrayList<Departamento> departamentos = new ArrayList<Departamento>();

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUbicacionGeografica() {
		return this.ubicacionGeografica;
	}

	public void setUbicacionGeografica(String ubicacionGeografica) {
		this.ubicacionGeografica = ubicacionGeografica;
	}
}