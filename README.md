# Pathfinder API

Projet de démonstration d'une API REST

Cette api renvoie des données basées sur l'univers de pathfinder.
Les données sont stockées sur une base de données MySQL dont vous trouverez le schéma ci-dessous.

## Table des matières

- [Pour commencer](#pour-commencer)
    - [Création de la base de données](#création-de-la-base-de-données)
        - [Script de création de la base](#script-de-création-de-la-base)
        - [Script d'insertion des données](#script-dinsertion-des-données)
        - [Schéma de la base de données](#schéma-de-la-base-de-données)
    - [Utiliser l'api](#utiliser-lapi)
- [Documentation](#documentation)
    - [Introduction](#introduction)
    - [Format des réponses](#format-des-réponses)
    - [Authentification](#authentification)
    - [Routes](#routes)
        - [Characters](#characters)
        - [Races](#races)
        - [Classes](#classes)
        - [Skills](#skills)
        - [Talents](#talents)
        - [Spells](#spells)
        - [Weapons](#weapons)
        - [Armors](#armors)
        - [Items](#items)
- [Auteur](#auteur)
- [Licence](#licence)

## Pour commencer

Pour commencer à utiliser l'api pathfinder vous devez créer une base de données avec les scripts fournis.
Les scripts se trouvent dans le dossier scripts.

### Création de la base de données

Vous devez ouvrir ou créer une connexion sur le port 3306 sur votre serveur MySQL.
Ou alors vous pouvez changer le port de la propriété "spring.datasource.url".

Exemple : 

ancien - jdbc:mysql://localhost:3306/pathfinder?serverTimezone=UTC 

nouveau - jdbc:mysql://localhost:{Votre Port}/pathfinder?serverTimezone=UTC

#### Script de création de la base
Une fois que votre connexion est établie et que votre serveur MySQL fonctionne vous pouvez ouvrir et exécuter le script pathfinder.sql dans votre SGBD.
#### Script d'insertion des données
Pour insérer les données dans la base de données, ouvrer et exécuter le script pathfinder_insert.sql.
#### Schéma de la base de données
![Schéma](img\pathfinder.png "schéma de la base de données")
### Utiliser l'api
Pour utiliser l'api vous devez lancer l'application.
Vous pouvez tester les endpoints grace au logiciel [Postman](https://www.postman.com/ "lien vers le site de Postman") ou avec l'outil de votre choix.
Je vous invite à consulter la partie "Documentation" pour savoir comment utiliser l'api.

## Documentation
### Introduction
Ceci est la documentation de l'api pathfinder.
### Format des réponses
Les réponses sont toutes sous forme JSON.
### Authentification
Aucune authentification n'est nécessaire pour utiliser cette api.
### Routes
Toutes les routes ont pour préfixe : http://localhost:8889/pathfinder
#### Characters


    GET /characters
Retourne la liste de tous les personnages.


    GET /characters/overview
Retourne une liste contenant des paires d'id et de nom des personnages.


    GET /characters/id/{id}
Id est un nombre entier.

Retourne le personnage avec l'id correspondant.


    GET /characters/name/{name}
Name est une chaine de caractères.

Retourne le personnage avec le nom correspondant.

    POST /characters
Le body de la requête doit contenir un personnage sous forme JSON.

Retourne le personnage créer si la requête réussie sinon renvoi une erreur.
#### Races


    GET /races
Retourne la liste de toutes les races.


    GET /races/id/{id}
Id est un nombre entier.

Retourne la race avec l'id correspondant.
#### Classes


    GET /classes
Retourne la liste de toutes les classes.


    GET /classes/id/{id}
Id est un nombre entier.

Retourne la classe avec l'id correspondant.
#### Skills


    GET /skills
Retourne la liste de toutes les compétences.


    GET /skills/id/{id}
Id est un nombre entier.

Retourne la compétence avec l'id correspondant.
#### Talents


    GET /talents
Retourne la liste de tous les dons.


    GET /talents/id/{id}
Id est un nombre entier.

Retourne le don avec l'id correspondant.
#### Spells


    GET /spells
Retourne la liste de tous les sorts.


    GET /spells/id/{id}
Id est un nombre entier.

Retourne le sort avec l'id correspondant.
#### Weapons


    GET /weapons
Retourne la liste de toutes les armes.


    GET /weapons/id/{id}
Id est un nombre entier.

Retourne l'arme avec l'id correspondant.
#### Armors


    GET /armors
Retourne la liste de toutes les armures.


    GET /armors/id/{id}
Id est un nombre entier.

Retourne l'armure avec l'id correspondant.
#### Items


    GET /items
Retourne la liste de tous les objets.


    GET /items/id/{id}
Id est un nombre entier.

Retourne l'objet avec l'id correspondant.
## Auteur
**Alexandre Thiellin** _alias_ [@alexandre-thiellin](https://github.com/alexandre-thiellin)
## Licence
Ce projet est sous licence MIT - voir le fichier [LICENSE.md](LICENSE.md) pour plus d'informations.