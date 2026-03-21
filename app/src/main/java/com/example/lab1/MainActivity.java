package com.example.lab1;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

/**
 * Application de compteur simple
 * Réalisé par : Mouad Charraj aka Z3R0-XR7
 */
public class MainActivity extends AppCompatActivity {

    // Variable pour mémoriser le nombre de clics (le score)
    private int scoreActuel = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Liaison avec le fichier de design (activity_main.xml)
        setContentView(R.layout.activity_main);

        // Récupération des éléments visuels par leurs IDs personnalisés
        TextView affichageScore = findViewById(R.id.affichage_chiffre_mouad);
        Button btnSalutations = findViewById(R.id.btn_dire_salut_mouad);
        Button btnCompteur = findViewById(R.id.btn_incrementeur_mouad);

        // Action du bouton Salutations : Affiche un Toast avec le score
        btnSalutations.setOnClickListener(v -> {
            String texteAffiche = getString(R.string.message_toast) + scoreActuel;
            Toast.makeText(this, texteAffiche, Toast.LENGTH_SHORT).show();
        });

        // Action du bouton Compteur : Augmente le score et met à jour l'affichage
        btnCompteur.setOnClickListener(v -> {
            scoreActuel++; // On ajoute 1 au score
            affichageScore.setText(String.valueOf(scoreActuel));
        });
    }
}
