#  Formulaire et navigation entre activités

## 📖 Description
Cette application Android permet de :
- Saisir des informations personnelles (nom, email, téléphone, adresse, ville).
- Valider les champs obligatoires (nom et email).
- Vérifier la validité de l’email.
- Envoyer les données vers une seconde activité pour affichage récapitulatif.
- Partager les informations via une intention de type `ACTION_SEND`.

---
## 📂 Structure du projet
```
app/
├── src/
│   └── main/
│       ├── java/
│       │   └── com/
│       │       └── example/
│       │           └── lab3/
│       │               ├── MainActivity.java
│       │               └── Screen2Activity.java
│       └── res/
│           └── layout/
│               ├── activity_main.xml
│               └── activity_screen2.xml
└── AndroidManifest.xml
```
---

## 🖥️ Exemple d’exécution
<img width="1743" height="923" alt="image" src="https://github.com/user-attachments/assets/4441d73b-d4a3-4a2f-b263-06743e62ab05" />


## 💡 Concepts pratiqués
- Validation des champs obligatoires (`isEmpty`, `Patterns.EMAIL_ADDRESS`).
- Passage de données entre activités avec `Intent` et `putExtra`.
- Affichage conditionnel avec méthode `safe()` pour éviter les valeurs nulles.
- Partage de texte avec `Intent.ACTION_SEND`.
- Cycle de vie d’une activité (`onResume`).

---

## 🧑‍💻 Auteur
👤 **Majjati Mohamed Taha**  
🎓 Instructor : **Mr. LACHGAR**  
📅 6 Mars 2026

