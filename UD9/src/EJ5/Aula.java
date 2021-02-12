package EJ5;

import java.util.ArrayList;
import java.util.Random;



public class Aula {
	private Random r = new Random();
	private final int ID_DEF = r.nextInt(200)+100;
	private final String materiasDis[] = {"matematicas","filosofia", "fisica"};
	
	private int id;
	private int nEstudiantes;
	private String materiaAula;
	private Profesor profAula;
	private ArrayList<Alumno> alumAula = new ArrayList<Alumno>();
	
	public Aula(int nEstudiantes, String materia) {
		this.id = ID_DEF;
		this.nEstudiantes = nEstudiantes;
		comprobarMateria(materia);
		this.profAula = new Profesor();
		llenarAula(nEstudiantes);
		
	}
	

	private void llenarAula(int nEstudiantes2) {
		int i = 0;
		
		while(i<nEstudiantes2) {
			alumAula.add(new Alumno());
			i++;
		}
	}


	private void comprobarMateria(String materia2) {
		
		for (int i = 0; i < materiasDis.length; i++) {
			if(materia2.equals(materiasDis[i])) {
				this.materiaAula = materia2;
			}else {
				this.materiaAula = "matematicas";
			}
				
		
		
	}
	}


	public boolean darClase() {
		int v = 0, f = 0;
		if(this.profAula.isDisponible()) {
			if(this.profAula.getMateria().equals(this.materiaAula)) {
				for(Alumno al:this.alumAula) {
					if(al.isDisponible()) {
						v++;
					}else {
						f++;
					}
				}
				if(v > f) {
					return true;
				}else {
					return false;
				}
				
			}else return false;
			
		}else return false;
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getnEstudiantes() {
		return nEstudiantes;
	}


	public void setnEstudiantes(int nEstudiantes) {
		this.nEstudiantes = nEstudiantes;
	}


	public void sacarNotas() {
		
		
		for(Alumno al:this.alumAula) {
			if(al.getSexo() == 'H') {
				comprobarNotaH(al);
			}else {
				comprobarNotaH(al);
			}
		}
		
	}


	private void comprobarNotaH( Alumno al) {
			if(al.getNota() > 5) {
			System.out.println("Nombre: "+al.getNombre()+" ---- Nota:"+al.getNota()+"\n");
			}
		
	}
	
	
	}


	
	
	
 
