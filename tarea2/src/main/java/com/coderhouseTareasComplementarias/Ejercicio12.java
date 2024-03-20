package com.coderhouseTareasComplementarias;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese su edad ");

		int numeroEntero = scanner.nextInt();
		
        if(numeroEntero>=18) {
        	System.out.println("Es mayor de edad ");
        }
        	else {
        		System.out.println("Es menor de edad");
        	}
        scanner.close();
        }
	}

