package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.courtcounter.models.Teams;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Teams teams = ViewModelProviders.of(this).get(Teams.class);
        teams.TeamA.setName("Werewolves");
        teams.TeamB.setName("Vampires");
        teams.TeamA.setScore(0);
        teams.TeamB.setScore(0);

        Button btnResetScores = findViewById(R.id.btnReset);
        btnResetScores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "What am I doing?", Toast.LENGTH_LONG).show();
            }
        });

        TextView teamANameTxtView = findViewById(R.id.lblTeamA);
        teamANameTxtView.setText(teams.TeamA.getName());

        TextView teamBNameTxtView = findViewById(R.id.lblTeamB);
        teamBNameTxtView.setText(teams.TeamB.getName());
    }
}
