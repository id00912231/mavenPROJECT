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

    public String getApellidos() {
        return this.apellidos;
    }

    public float getEdad() {
        return this.edad;
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

    public static Persona factoryRecibeString(String cadena) {
        if (cadena == null) {
            throw new IllegalArgumentException("No son válidos los argumentos");
        }
        String tokens[] = cadena.split(",");

        if (tokens.length != 3) {
            return null;
        }

        try {
            float edad = Float.parseFloat(tokens[2]);
            return new Persona(tokens[0], tokens[1], edad);
        } catch (Exception e) {
            throw new IllegalArgumentException("No son válidos los argumentos");
        }
    }
}
