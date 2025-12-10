package com.astrai;

/**
 * Clase Persona
 */

public class Persona {

    private String nombre;
    private String apellidos;
    private float edad;

    /**
     * Getter del Nombre, el nombre de la persona
     * 
     * @return
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Constructor con argumentos:
     * 
     * @param nombre    de la persona
     * @param apellidos de la persona
     * @param edad      de la persona
     */

    public Persona(String nombre, String apellidos, float edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }
}
