package HerentziaProfesoresAlumnos;

public class Alumno extends Persona {
	
	private String Matricula;
	
	public Alumno(String dni, String nombre, String apellido, int edad, String matricula){
		super(dni, nombre, apellido, edad);
		this.Matricula=matricula;
	}
	
	
	
	public String getMatricula() {
		return this.Matricula;
	}
	
	public void setMatricula(String matricula) {
		this.Matricula=matricula;
	}
	
	public String getDNI() {
		return super.getDNI();
	}
	
	public void setDNI(String dNI) {
		super.setDNI(dNI);
	}
	
	public String getNombre() {
		return super.getNombre();
	}
	
	public void setNombre(String nombre) {
		super.setNombre(nombre);
	}
	
	public String getApellido() {
		return super.getApellido();
	}
	
	public void setApellido(String apellido) {
		super.setApellido(apellido);;
	}
	
	public int getEdad() {
		return super.getEdad();
	}
	
	public void setEdad(int edad) {
		super.setEdad(edad);;
	}



	@Override
	public void decir_la_tipica_frase() {
		// TODO Auto-generated method stub
		System.out.println("Sin mas...");
	}

}
	
	


