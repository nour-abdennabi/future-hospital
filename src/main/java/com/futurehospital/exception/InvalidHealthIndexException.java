package com.futurehospital.exception;

/**
 * exception pour gérer les erreurs d'entrée invalide pour l'index de santé
 */
public class InvalidHealthIndexException extends RuntimeException {
    public InvalidHealthIndexException(String message) {
        super(message);
    }
}
