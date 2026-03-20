package com.example.lab1;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // Variable pour mémoriser le nombre de clics
    private int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // On affiche l'interface définie dans activity_main.xml
        setContentView(R.layout.activity_main);

        // On récupère les éléments de l'interface par leur ID
        TextView affichageScore = findViewById(R.id.tv_score);
        Button boutonBonjour = findViewById(R.id.btn_hello);
        Button boutonAjouter = findViewById(R.id.btn_plus);

        // Action quand on clique sur le bouton "Dire Bonjour"
        boutonBonjour.setOnClickListener(v -> {
            // On prépare un message avec le score actuel
            String message = getString(R.string.message_toast) + score;
            // On l'affiche à l'écran
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
        });

        // Action quand on clique sur le bouton "Compter"
        boutonAjouter.setOnClickListener(v -> {
            // On augmente le score de 1
            score = score + 1;
            // On met à jour le texte affiché
            affichageScore.setText(String.valueOf(score));
        });
    }
}
