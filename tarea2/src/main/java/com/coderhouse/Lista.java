package com.coderhouse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Lista {

    public static void main(String[] args) {
        // Crear objetos Persona y establecer nombres y apellidos
        Persona persona1 = new Persona();
        persona1.setNombre("Juan Manuel");
        persona1.setApellido("Adad");
        Persona persona2 = new Persona();
        persona2.setNombre("Augusto");
        persona2.setApellido("Aguirre");
        Persona persona3 = new Persona();
        persona3.setNombre("Nahuel");
        persona3.setApellido("Alzueta");
        Persona persona4 = new Persona();
        persona4.setNombre("Bautista");
        persona4.setApellido("Bascari");
        Persona persona5 = new Persona();
        persona5.setNombre("Iñaki");
        persona5.setApellido("Balmaceda");
        
        // Crear una lista y agregar los objetos Persona a la lista
        List<Persona> listaPersonas = new ArrayList<>();
        listaPersonas.add(persona1);
        listaPersonas.add(persona2);
        listaPersonas.add(persona3);
        listaPersonas.add(persona4);
        listaPersonas.add(persona5);
        
        // Ordenar la lista alfabéticamente por nombre
        Collections.sort(listaPersonas, Comparator.comparing(Persona::getNombre));
        
        // Mostrar en consola la lista ordenada por nombre
        System.out.println("Lista ordenada por nombre:");
        for (Persona persona : listaPersonas) {
            System.out.println(persona);
        }
        
        // Ordenar la lista alfabéticamente por apellido
        Collections.sort(listaPersonas, Comparator.comparing(Persona::getApellido));
        
        // Mostrar en consola la lista ordenada por apellido
        System.out.println("\nLista ordenada por apellido:");
        for (Persona persona : listaPersonas) {
            System.out.println(persona);
        }
        
        // Ordenar la lista en orden inverso por apellido
        Collections.sort(listaPersonas, Comparator.comparing(Persona::getApellido, Comparator.reverseOrder()));
        
        // Mostrar en consola la lista ordenada inversamente por apellido
        System.out.println("\nLista ordenada inversamente por apellido:");
        for (Persona persona : listaPersonas) {
            System.out.println(persona);
        }
    }
}