package com.example.mehul.courtcenter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void scorePlusThreeForTeamA(View view){
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);

    }
    public void scorePlusTwoForTeamA(View view){
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);

    }
    public void scorePlusOneForTeamA(View view){
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);

    }


    public void displayForTeamA (int score){
        TextView teamAScore = (TextView)findViewById(R.id.team_a_score);
        teamAScore.setText(String.valueOf(score));
    }
    public void scorePlusThreeForTeamB(View view){
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);

    }
    public void scorePlusTwoForTeamB(View view){
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);

    }
    public void scorePlusOneForTeamB(View view){
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);

    }


    public void displayForTeamB (int score){
        TextView teamBScore = (TextView)findViewById(R.id.team_b_score);
        teamBScore.setText(String.valueOf(score));
    }
    public void scoreToZero(View view){
        scoreTeamA = 0 ;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

}
