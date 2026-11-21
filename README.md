# TP 1.4 — JavaFX + JDBC (MySQL)

![Java](https://img.shields.io/badge/Java-ed8b00?style=flat-square&logo=openjdk&logoColor=white) ![JavaFX](https://img.shields.io/badge/JavaFX_23-2b5b84?style=flat-square) ![Maven](https://img.shields.io/badge/Maven-c71a36?style=flat-square&logo=apachemaven&logoColor=white) ![MySQL](https://img.shields.io/badge/MySQL-4479a1?style=flat-square&logo=mysql&logoColor=white)

TP de programmation orientée objet (L3 GLSI, ESP Dakar) : une interface JavaFX décrite en FXML, reliée à une base MySQL par JDBC.

## Ce que fait l'application

- Affiche une fenêtre JavaFX chargée depuis `vue.fxml`
- Un bouton teste la connexion à la base `tp13` et affiche le nombre de messages de la table `information`
- `DatabaseConnection` centralise l'URL JDBC et fournit les connexions (try-with-resources, `PreparedStatement`)

## Structure

```
src/main/java/sn/ucad/esp/glsi/tp14/
├── App.java                 lancement JavaFX
├── PrimaryController.java   contrôleur de vue.fxml
└── DatabaseConnection.java  connexion JDBC MySQL
src/main/resources/.../vue.fxml
```

## Lancer

Prérequis : JDK 21+, Maven, un serveur MySQL avec la base `tp13` (table `information`).

```bash
mvn clean javafx:run
```

Les identifiants de la base se règlent dans `DatabaseConnection.java` (identifiants de TP en local uniquement).

---

<p align="center">Réalisé par <a href="https://github.com/Moussa-Ndioukh-Faye"><b>Moussa Ndioukh Faye</b></a> · École Supérieure Polytechnique de Dakar (ESP/UCAD)</p>
