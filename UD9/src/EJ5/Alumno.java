package EJ5;

import java.util.Random;

public class Alumno extends Persona {
	
	Random r = new Random();
	
	
	private int nota;
	private boolean disponible;
	
	public Alumno() {
		int nota = r.nextInt(10)+1;
		this.nota = nota;
		saberDisponibilidad();
	}
	

	@Override
	public void saberDisponibilidad() {
		if(r.nextInt(100)+1 >= 50) {
			this.disponible = false;
		}else {
			this.disponible = true;
		}
	}


	public int getNota() {
		return nota;
	}


	public void setNota(int nota) {
		this.nota = nota;
	}


	public boolean isDisponible() {
		return disponible;
	}


	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
	
	
}
