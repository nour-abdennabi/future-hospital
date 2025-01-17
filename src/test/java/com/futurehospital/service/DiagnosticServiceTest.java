package com.futurehospital.service;

import com.futurehospital.exception.InvalidHealthIndexException;
import com.futurehospital.service.impl.DiagnosticServiceImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


/**
 * cette classe contient des tests unitaires pour le service de diagnostic
 *
 */
public class DiagnosticServiceTest {
    private final DiagnosticService diagnosticService = new DiagnosticServiceImpl();

    /**
     * Teste le diagnostic pour un index de santé multiple de 3
     * Le service doit renvoyer "Cardiologie"
     */
    @Test
    void testCardiology() {
        int healthIndex = 33;
        String result = diagnosticService.diagnose(healthIndex);
        assertEquals("Cardiologie", result);
    }

    /**
     * Teste le diagnostic pour un index de santé multiple de 5
     * Le service doit renvoyer "Traumatologie"
     */
    @Test
    void testTraumatology() {
        int healthIndex = 55;
        String result = diagnosticService.diagnose(healthIndex);
        assertEquals("Traumatologie", result);
    }

    /**
     * Teste le diagnostic pour un index de santé multiple de 3 et de 5
     * Le service doit renvoyer "Cardiologie, Traumatologie"
     */
    @Test
    void testCardiologyAndTraumatology() {
        int healthIndex = 15;
        String result = diagnosticService.diagnose(healthIndex);
        assertEquals("Cardiologie, Traumatologie", result);
    }

    /**
     * Teste le diagnostic pour un index de santé ne correspondant à aucune pathologie
     * Le service doit renvoyer "Aucune pathologie détectée"
     */
    @Test
    void testNoPathologyDetected() {
        int healthIndex = 7; // Pas un multiple de 3 ni de 5, le système doit renvoyer aucune pathologie détectée
        String result = diagnosticService.diagnose(healthIndex);
        assertEquals("Aucune pathologie détectée", result);
    }

    /**
     * Teste le diagnostic avec un index de santé invalide
     * Une exception InvalidHealthIndexException doit être levée
     */
    @Test
    void testInvalidHealthIndexThrowsException() {
        int invalidHealthIndex = -10;
        assertThrows(InvalidHealthIndexException.class,
                () -> diagnosticService.diagnose(invalidHealthIndex),
                "Expected InvalidHealthIndexException to be thrown for a negative health index");
    }
}
