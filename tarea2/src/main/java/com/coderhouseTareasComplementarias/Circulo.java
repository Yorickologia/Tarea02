package com.coderhouseTareasComplementarias;

public class Circulo {
	private int radio;
	 private static final double PI = Math.PI;
	
	//constructor
	public Circulo(int radio) {
		super();
		this.radio = radio;
	}

	public static double calcularArea(int radio) {
		return PI*radio*radio;
	}
   public double calcularCircunferencia() {
	return 2*PI*radio;
}


	public static void main(String[] args) {
		Circulo circulo = new Circulo(4);

System.out.println("El area es: " + Circulo.calcularArea(circulo.radio));
System.out.println("La circunferencia es: " + circulo.calcularCircunferencia());
	}

}
