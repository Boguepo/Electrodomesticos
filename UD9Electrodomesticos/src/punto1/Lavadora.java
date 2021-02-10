package punto1;

public class Lavadora extends Electrodomestico {
	
	/*Crearemos una subclase llamada Lavadora con las siguientes características:
		-Su atributo es carga, ademas de los atributos heredados.
		-Por defecto, la carga es de 5 kg. Usa una constante para ello.
		
		Los constructores que se implementaran serán:
		
		.Un constructor por defecto.
		.Un constructor con el precio y peso. El resto por defecto.
		.Un constructor con la carga y el resto de atributos heredados. Recuerd que debes llamar al constructor de la clase padre.

	 */
	//CONSTANTE 
	protected final double CARGA_CONST=5;
	
	//ATRIBUTOS
	protected double carga;
	
	//Constructor por defecto
	public Lavadora() {
		super();
		this.carga=CARGA_CONST;
	}
	
	public Lavadora(double precio,double peso) {
		super(precio,peso);
		this.carga=CARGA_CONST;
	}
	
	public Lavadora(double precioBase,String color,char consumoEnergetico,double peso,double carga) {
		super(precioBase,color,consumoEnergetico,peso);
		this.carga=carga;
	}

	//MÉTODO GET
	public double getCarga() {
		return carga;
	}
	
	//precioFinal():, si tiene una carga mayor de 30 kg, aumentara el precio 50
	//€, sino es así no se incrementara el precio. Llama al método padre y
	//añade el código necesario. Recuerda que las condiciones que hemos visto
	//en la clase Electrodomestico también deben afectar al precio.
	
	public double precioFinal() {
		double precio=0;
		if(this.carga>30) {
			precio=super.precioFinal()+50;
		}else {
			precio=super.precioFinal();
		}
		
		return precio;
	}
	
	
}
