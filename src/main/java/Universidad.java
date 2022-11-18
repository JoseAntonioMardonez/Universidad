import java.util.ArrayList;

public class Universidad {
	private String nombre;
	private String direccion;
	private String tipoUniversidad;
	public ArrayList<Trabajador> trabajadores = new ArrayList<Trabajador>();
	private ArrayList<Facultad> facultades = new ArrayList<Facultad>();

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public void obtenerProfesoresFacultad() {
		throw new UnsupportedOperationException();
	}

	public void obtenerCarrerasFacultad() {
		throw new UnsupportedOperationException();
	}

	public void obtenerProfesoresDepartamento() {
		throw new UnsupportedOperationException();
	}

	public void obtenerProfesores() {
		throw new UnsupportedOperationException();
	}

	public void obtenerAdministrativos() {
		throw new UnsupportedOperationException();
	}
}