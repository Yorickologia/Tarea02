package com.coderhouseTareasComplementarias;

import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
     Scanner scanner = new  Scanner(System.in); 
     System.out.println("Ingrese un año");
     int añoIngresado = scanner.nextInt();
     
     boolean esBisiesto = false;
     
     if ((añoIngresado % 4 == 0 && añoIngresado % 100 != 0) || (añoIngresado % 400 == 0)) {
    	    esBisiesto = true;
    	}
	if(esBisiesto) {
	System.out.println("Es bisiesto");
	}
	else {
		System.out.println("No Es bisiesto");
		
		scanner.close();
	}
  }
}

