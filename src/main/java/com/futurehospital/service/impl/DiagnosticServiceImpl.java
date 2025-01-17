package com.futurehospital.service.impl;

import com.futurehospital.exception.InvalidHealthIndexException;
import com.futurehospital.service.DiagnosticService;


public class DiagnosticServiceImpl implements DiagnosticService {
    @Override
    public String diagnose(int healthIndex) {
        if (healthIndex < 0) {
            throw new InvalidHealthIndexException("L'index de santé ne peut pas être négatif: " + healthIndex);
        }
        StringBuilder result = new StringBuilder();
        if (healthIndex % 3 == 0) {
            result.append("Cardiologie");
        }
        if (healthIndex % 5 == 0) {
            if (result.length() > 0) {
                result.append(", ");
            }
            result.append("Traumatologie");
        }
        return result.length() > 0 ? result.toString() : "Aucune pathologie détectée";
    }
}
