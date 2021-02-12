package EJ5;

import java.util.Random;

public class Profesor extends Persona {
	Random r = new Random();
	
	private final String materiasDis[] = {"matematicas","filosofia", "fisica"};
	private final int mat = r.nextInt(2);
	
	
	private String materia;
	private boolean disponible;
	
	public Profesor() {
		super();
		saberDisponibilidad();
		this.materia = materiasDis[mat];
		comprobarMateria(materia);
	}
	





	private void comprobarMateria(String materia2) {
		
		for (int i = 0; i < materiasDis.length; i++) {
			if(materia2.equals(materiasDis[i])) {
				this.materia = materia2;
			}else {
				this.materia = "matematicas";
			}
				
		
		
	}
	}

	@Override
	public void saberDisponibilidad() {
		if(r.nextInt(100)+1 >= 80) {
			this.disponible = false;
		}else {
			this.disponible = true;
		}
		
	}




	public String getMateria() {
		return materia;
	}




	public void setMateria(String materia) {
		this.materia = materia;
	}




	public boolean isDisponible() {
		return disponible;
	}




	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
	
	
	
	
	
}
