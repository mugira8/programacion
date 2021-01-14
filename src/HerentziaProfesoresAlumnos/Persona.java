package HerentziaProfesoresAlumnos;

public abstract class Persona {
	
	private String DNI;
	private String Nombre;
	private String Apellido;
	private int Edad;
	
	
	public Persona(String dni, String nombre, String apellido, int edad){
		this.DNI=dni;
		this.Nombre=nombre;
		this.Apellido=apellido;
		this.Edad=edad;
	}
	
	public abstract void decir_la_tipica_frase();
	
	public String getDNI() {
		return DNI;
	}
	
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	
	public String getNombre() {
		return Nombre;
	}
	
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	
	public String getApellido() {
		return Apellido;
	}
	
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	
	public int getEdad() {
		return Edad;
	}
	
	public void setEdad(int edad) {
		this.Edad = edad;
	}
		
}
