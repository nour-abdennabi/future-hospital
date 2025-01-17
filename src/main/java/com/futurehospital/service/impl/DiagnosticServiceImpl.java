package com.futurehospital.service.impl;

import com.futurehospital.exception.InvalidHealthIndexException;
import com.futurehospital.model.HealthIndex;
import com.futurehospital.service.DiagnosticService;


public class DiagnosticServiceImpl implements DiagnosticService {
    @Override
    public String diagnose(int healthIndexValue) {
        HealthIndex healthIndex = new HealthIndex(healthIndexValue);

        if (healthIndex.isCardiological() && healthIndex.isTraumatological()) {
            return "Cardiologie, Traumatologie";
        } else if (healthIndex.isCardiological()) {
            return "Cardiologie";
        } else if (healthIndex.isTraumatological()) {
            return "Traumatologie";
        }
        return "Aucune pathologie détectée";
    }
}
