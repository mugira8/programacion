package HerentziaProfesoresAlumnos;

public class Profesor extends Persona implements Docente{ //poniendo una coma puedo añadirle mas interfaces "implements docente, director, etc"
	
	private String Cargo;
	
	public Profesor(String dni, String nombre, String apellido, int edad, String cargo){
		super(dni, nombre, apellido, edad);
		this.Cargo=cargo;
	}
	
	
	public String getCargo() {
		return this.Cargo;
	}
	
	public void setCargo(String cargo) {
		this.Cargo=cargo;
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
		System.out.println("Bai, bale, ondo");
	}


	@Override
	public void poner_notas() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void dar_clases() {
		// TODO Auto-generated method stub
		
	}

}
