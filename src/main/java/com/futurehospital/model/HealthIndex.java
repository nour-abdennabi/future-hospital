package com.futurehospital.model;

import com.futurehospital.exception.InvalidHealthIndexException;

public class HealthIndex {
    private int value;

    /**
     * Constructeur de la classe HealthIndex
     *
     * @param value l'index de santé à attribuer
     * @throws InvalidHealthIndexException si l'index de santé est négatif
     */
    public HealthIndex(int value) {
        if (value < 0) {
            throw new InvalidHealthIndexException("L'index de santé ne peut pas être négatif.");
        }
        this.value = value;
    }

    /**
     * Obtient la valeur de l'index de santé du patient.
     *
     * @return la valeur de l'index de santé
     */
    public int getValue() {
        return value;
    }

    /**
     * Modifie la valeur de l'index de santé
     *
     * @param value la nouvelle valeur de l'index de santé
     * @throws IllegalArgumentException si la nouvelle valeur est négative
     */
    public void setValue(int value) {
        if (value < 0) {
            throw new IllegalArgumentException("L'index de santé ne peut pas être négatif.");
        }
        this.value = value;
    }

    /**
     * Vérifie si l'index de santé indique un problème cardiaque: si l'index est un multiple de 3
     *
     * @return true si l'index de santé est un multiple de 3, sinon false
     */
    public boolean isCardiological() {
        return value % 3 == 0;
    }

    /**
     * Vérifie si l'index de santé indique un problème de fracture: si l'index est un multiple de 5
     *
     * @return true si l'index de santé est un multiple de 5, sinon false
     */
    public boolean isTraumatological() {
        return value % 5 == 0;
    }

    /**
     * Retourne une représentation sous forme de chaîne de caractères de l'index de santé
     *
     * @return la valeur de l'index de santé sous forme de chaîne
     */
    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
