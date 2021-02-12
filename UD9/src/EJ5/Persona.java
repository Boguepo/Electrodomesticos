package EJ5;

import java.util.Random;

public abstract class Persona {
	private Random r = new Random();
	
	
	private final char SEXO_DEF[] = {'H','M'};
	private final String NOMH_DEF[] = {"Antonio","Jose","Manuel","Pepe"};
	private final String NOMM_DEF[] = {"Maria","Alba","Vanesa","Marta"};
	
	private String nombre;
	private int edad;
	private char sexo;
	
	
	public Persona() {
		int EDAD_DEF = r.nextInt(27)+15;
		
		randSexo();
		randNombre();
		this.edad =EDAD_DEF;
		
	}
	

	private void randNombre() {
		int i = r.nextInt(3);
		
		if(this.sexo == 'H') {
			this.nombre = NOMH_DEF[i];
		}else {
			this.nombre = NOMM_DEF[i];
		}
		
	}


	private void randSexo() {
		int i = r.nextInt(1);
		
		if(i == 0) {
			this.sexo = SEXO_DEF[i];
		}else {
			this.sexo = SEXO_DEF[i];
		}
		
	}

	
	public abstract void saberDisponibilidad();
		


	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
}
