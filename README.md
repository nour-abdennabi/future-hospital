# Hôpital du Futur - Système de Diagnostic

## Description

Ce projet est un système de diagnostic automatisé pour l'hôpital du futur. Il permet de diagnostiquer les pathologies d'un patient en fonction d'un index de santé généré par un capteur automatisé.

Les pathologies diagnostiquées sont les suivantes :
- **Cardiologie** : Si l'index de santé est un multiple de 3.
- **Traumatologie** : Si l'index de santé est un multiple de 5.
- **Les deux** : Si l'index de santé est un multiple de 3 et de 5.

Le programme redirige le patient vers les unités médicales appropriées en fonction des pathologies détectées.

## Prérequis

- **Java 17** ou version supérieure
- **Maven** pour la gestion des dépendances

## Installation

1. Clonez ce repository sur votre machine locale :

   ```bash
   git clone https://github.com/nour-abdennabi/future-hospital.git