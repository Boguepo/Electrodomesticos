package EJ1;

public class Television extends Maquina{
	//CONSTANTES
	private final int RES_DEF = 20;
	private final boolean TDT_DEF = false;
	//ATRIBUTOS
	private int resolucion;
	private boolean tdt;
	//Constructor por defecto
	public Television() {
		super();//llamada al constructor de la clase padre
		this.resolucion = RES_DEF;
		this.tdt = TDT_DEF;
	}
	//Constructor sobrecargado con el precio y el peso
	public Television(int precio, int peso) {
		
		super(precio, peso);//llamada al constructor sobrecargado de la clase padre
		this.resolucion = RES_DEF;
		this.tdt = TDT_DEF;
		
	}
	
	//Constructor sobrecargado con todos los atributos
	public Television(int precio, int peso, String color, char consumo, int resolucion, boolean tdt) {
		
		super(precio,peso,color,consumo);//llamada al constructor sobrecargado de la clase padre
		this.resolucion = resolucion;
		this.tdt = tdt;
		precioFinal(resolucion,tdt);//actualizo el precio total del producto si cumple una condiciones
		
	}
//Metodo sobrecargado que actualiza el precio final
	private void precioFinal(int resolucion2, boolean tdt ) {
		
		super.precioFinal();//llamada al metodo de la clase padre
		if(this.tdt) {
			this.precioTotal += 50; 
		}
		
		if(this.resolucion > 40) {
			this.precioTotal += this.precioTotal * 0.3;
		}
		
	}

	//GET & SET
	public int getResolucion() {
		return resolucion;
	}

	public void setResolucion(int resolucion) {
		this.resolucion = resolucion;
	}

	public boolean isTdt() {
		return tdt;
	}

	public void setTdt(boolean tdt) {
		this.tdt = tdt;
	}
	
}
