package semana4.clase7;

import java.util.Objects;

public class Estudiante {
	protected String nombre;
	protected String apellido;
	protected String dni;
	private Boolean becario = establecerBecario();
	
	public Estudiante(String nombre, String apellido, String dni) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
	}
	
	public boolean establecerBecario() {
		return true;
	}
	
	public void presentarEstudiante() {
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(apellido, becario, dni, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estudiante other = (Estudiante) obj;
		return Objects.equals(apellido, other.apellido) && Objects.equals(becario, other.becario)
				&& Objects.equals(dni, other.dni) && Objects.equals(nombre, other.nombre);
	}

	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", becario=" + becario
				+ "]";
	}
	
	
}
