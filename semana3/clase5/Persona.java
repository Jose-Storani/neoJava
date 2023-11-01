package semana3.clase5;

import java.time.LocalDateTime;

public class Persona {
	String nombre;
	String apellido;
	LocalDateTime fechaDeNacimiento;
	
	public Persona(String nombre,String apellido, LocalDateTime fechaDeNacimiento) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	
	public int edad() {
		int yearToday = LocalDateTime.now().getYear();
		return yearToday - fechaDeNacimiento.getYear();
	}
	
}
