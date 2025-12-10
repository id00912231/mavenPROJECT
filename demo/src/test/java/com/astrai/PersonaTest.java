package com.astrai;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class PersonaTest {
    @Test
    void testFactoryRecibeString() {

        String input = "Juan,Garcia,25";
        // Act
        Persona persona = Persona.factoryRecibeString(input);
        // Assert
        assertNotNull(persona);
        assertEquals("Juan", persona.getNombre());
        assertEquals("Garcia", persona.getApellidos());
        assertEquals(25, persona.getEdad());
    }
}
