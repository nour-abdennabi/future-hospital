package com.futurehospital.service;

/**
 * Service de diagnostic pour déterminer les pathologies en fonction de l'index de santé
 */
public interface DiagnosticService {
    /**
     * Diagnostique l'index de santé et retourne une chaîne de caractères indiquant les pathologies
     *
     * @param healthIndex L'index de santé du patient
     * @return les pathologies détectées
     */
    String diagnose(int healthIndex);
}
