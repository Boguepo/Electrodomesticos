package EJ4;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Raices {
	DecimalFormat formateador = new DecimalFormat("####.##");
	private double a, b, c;
	private boolean raices = false, raiz = false;

	public Raices(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.raices = tieneRaices();
		this.raiz = tieneRaiz();
	}
	
	public void obtenerRaiz() {
		
			this.calcular();
		
	}
	
	public void obtenerRaices() {
		
			this.calcular();
	}
	
	public double getDiscriminante() {
		double discriminante = 0;
		
		discriminante = (Math.pow(this.b, 2))-(4*this.a*this.c);
		
		return discriminante;
	}
	
	public boolean tieneRaices() {
		
		if(this.getDiscriminante() >= 0) {
			return true;
		}else{
			return false;
		}
		
	}
	
	public boolean tieneRaiz() {
		if(this.getDiscriminante() == 0) {
			return true;
		}else{
			return false;
		}
	}
	
	public void calcular() {
		double resultado = 0, resultado2 = 0;
		
		
		if(this.raiz) {
			
			resultado = (-this.b + Math.sqrt((Math.pow(this.b, 2))-(4*this.a*this.c)))/(2*this.a);
			JOptionPane.showMessageDialog(null, "Resulta do de la equacion: "+formateador.format(resultado));
			
		}else if(this.raices) {
			
			resultado = (-this.b + Math.sqrt((Math.pow(this.b, 2))-(4*this.a*this.c)))/(2*this.a);
			resultado2 = (this.b + Math.sqrt((Math.pow(this.b, 2))-(4*this.a*this.c)))/(2*this.a);
			JOptionPane.showMessageDialog(null, "Resultados de la equacion: "+formateador.format(resultado)+" "+formateador.format(resultado2));
			
		}else {
			JOptionPane.showMessageDialog(null, "La equiacion no tiene resultado");
		}
	}

}
