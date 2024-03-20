package com.coderhouseTareasComplementarias;

public class Triangulo {
	private int base;
	private int altura;
	
	

	public Triangulo(int base, int altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

	public int calcularArea() {
		return base*altura/2;
	}


	public static void main(String[] args) {
		Triangulo triangulo = new Triangulo(2, 3);
	System.out.println("El area del triangulo es: " + triangulo.calcularArea());

	}

}
