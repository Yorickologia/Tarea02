package com.coderhouseTareasComplementarias;


//Ejercicio5

public class Rectangulo {
	private int ancho;
	private int alto;
	
	
	//Constructor
	
	public Rectangulo(int ancho, int alto) {
		super();
		this.ancho = ancho;
		this.alto = alto;
	}

	public int calcularArea() {
		return ancho*alto;
	}

	public static void main(String[] args) {
		Rectangulo rectangulo = new Rectangulo (5,3);
	
System.out.println("El area del Rectangulo es: "+ rectangulo.calcularArea());

	}

}
