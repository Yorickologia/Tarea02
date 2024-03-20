package com.coderhouseTareasComplementarias;

public class Ejercicio19 {

	public static void main(String[] args) {
	
		int[][] matrizEnteros = new int[3][3];
		
		matrizEnteros[0][0] = 1;
        matrizEnteros[0][1] = 2;
        matrizEnteros[0][2] = 3;
        matrizEnteros[1][0] = 4;
        matrizEnteros[1][1] = 5;
        matrizEnteros[1][2] = 6;
        matrizEnteros[2][0] = 7;
        matrizEnteros[2][1] = 8;
        matrizEnteros[2][2] = 9;
        
        for(int fila = 0; fila < 3; fila++) {
        	for(int columna = 0; columna < 3; columna++) {
        		System.out.println("Elemento en la posición [" + fila + "][" + columna + "]: " + matrizEnteros[fila][columna]);
        	}
        }
	}
}
