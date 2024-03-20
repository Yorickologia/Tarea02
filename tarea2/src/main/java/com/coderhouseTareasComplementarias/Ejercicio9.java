package com.coderhouseTareasComplementarias;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio9 {

	public static void main(String[] args) {
	List<String> listaDeNombres = new ArrayList<>();
	listaDeNombres.add("Nahuel");
	listaDeNombres.add("Cande");
	listaDeNombres.add("Gato Seras");
	int posicion = 0;
	int posicion1 = 1;
	int posicion2 = 2;
	System.out.println("El nombre en la posicion "+posicion + " Es "+ listaDeNombres.get(posicion));
	System.out.println("El nombre en la posicion "+posicion1 + " Es "+ listaDeNombres.get(posicion1));
	System.out.println("El nombre en la posicion "+posicion2 + " Es "+ listaDeNombres.get(posicion2));
	}

}
