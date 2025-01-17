package com.futurehospital;

import com.futurehospital.exception.InvalidHealthIndexException;
import com.futurehospital.service.DiagnosticService;
import com.futurehospital.service.impl.DiagnosticServiceImpl;

import java.util.Scanner;

/**
 * classe main permettant d'interagir avec l'utilisateur pour diagnostiquer les pathologies en fonction de l'index de santé
 */
public class App {
    public static void main(String[] args) {
        DiagnosticService diagnosticService = new DiagnosticServiceImpl();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez l'index de santé :");
        try {
            if (!scanner.hasNextInt()) {
                throw new InvalidHealthIndexException("Erreur : Veuillez entrer un nombre entier valide pour l'index de santé");
            }
            int healthIndex = scanner.nextInt();
            String result = diagnosticService.diagnose(healthIndex);
            System.out.println(result);
        } catch (InvalidHealthIndexException e) {
            System.out.println(e.getMessage());
        }  finally {
            // fermer le scanner pour éviter les fuites de ressources
            scanner.close();
        }
    }
}
