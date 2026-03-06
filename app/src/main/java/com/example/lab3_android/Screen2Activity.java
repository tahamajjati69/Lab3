package com.example.lab3_android;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Screen2Activity extends AppCompatActivity {

    private TextView recap;
    private Button btnRetour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2); // relie au XML du récap

        recap = findViewById(R.id.recap);
        btnRetour.setOnClickListener(v -> finish());

        // 1️⃣ Récupérer l'Intent qui a lancé cet écran
        Intent intent = getIntent();

        // 2️⃣ Extraire les données envoyées depuis MainActivity
        String nom     = intent.getStringExtra("nom");
        String email   = intent.getStringExtra("email");
        String phone   = intent.getStringExtra("phone");
        String adresse = intent.getStringExtra("adresse");
        String ville   = intent.getStringExtra("ville");

        // 3️⃣ Construire un texte formaté
        String resume = "Nom : " + safe(nom) +
                "\nEmail : " + safe(email) +
                "\nPhone : " + safe(phone) +
                "\nAdresse : " + safe(adresse) +
                "\nVille : " + safe(ville);

        // 4️⃣ Afficher le récapitulatif
        recap.setText(resume);

        // 5️⃣ Bouton retour
        btnRetour.setOnClickListener(v -> finish());
    }

    // Fonction de sécurité : éviter null ou texte vide
    private String safe(String s) {
        return (s == null || s.trim().isEmpty()) ? "—" : s.trim();
    }
}