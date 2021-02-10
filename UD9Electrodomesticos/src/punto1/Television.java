package punto1;

public class Television extends Electrodomestico {
	/*Sus atributos son resoluci�n (en pulgadas) y sintonizador TDT (booleano), ademas de los atributos heredados.
 	-Por defecto, la resoluci�n sera de 20 pulgadas y el sintonizador sera false.*/
	/*Los constructores que se implementaran ser�n:
		Un constructor por defecto.
		Un constructor con el precio y peso. El resto por defecto.
		Un constructor con la resoluci�n, sintonizador TDT y el resto de atributos heredados. Recuerda que debes llamar al constructor de la clase padre.
	 */
	
	//CONSTANTE
	protected final int PULGADAS_CONST=20;
	protected final boolean SINTO_CONST=false;
	
	//ATRIBUTOS
	protected int pulgadas;
	protected boolean sintonizador;
	
	//CONSTRUCTORES
	public Television() {
		super();
		this.pulgadas=PULGADAS_CONST;
		this.sintonizador=SINTO_CONST;
	}
	
	public Television(double precioBase,double peso) {
		super(precioBase,peso);
		this.pulgadas=PULGADAS_CONST;
		this.sintonizador=SINTO_CONST;
	}
	
	public Television(double precioBase,String color,char consumoEnergetico,double peso,int pulgadas,boolean sintonizador) {
		super(precioBase,color,consumoEnergetico,peso);
		this.pulgadas=pulgadas;
		this.sintonizador=sintonizador;
	}
	
	//M�TODO GET
	public int getPulgadas() {
		return pulgadas;
	}

	public boolean isSintonizador() {
		return sintonizador;
	}
	
	/*precioFinal(): si tiene una resoluci�n mayor de 40 pulgadas, se incrementara el precio un 30% y si tiene un sintonizador TDT incorporado, 
	 * aumentara 50 �. Recuerda que las condiciones que hemos visto en la clase 
	 * Electrodomestico tambi�n deben afectar al precio.*/
	
	public double precioFinal() {
		double precio=0;
		if(this.pulgadas>40) {
			precio=super.precioFinal()*0.3;	
		}else if (this.sintonizador){
			precio=super.precioFinal()+50;
		}else {
			precio=super.precioFinal();
		}
		
		System.out.println(precio);
		return precio;
		
	}
	
	
	
}
