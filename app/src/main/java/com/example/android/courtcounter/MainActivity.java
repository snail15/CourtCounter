package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int teamA_score = 0;
    private int teamB_score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */

    public void resetDisplay(View view){
        teamA_score = 0;
        teamB_score = 0;
        displayForTeamA(teamA_score);
        displayForTeamB(teamB_score);
    }
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void three_points_scoredA(View view){
        teamA_score += 3;
        displayForTeamA(teamA_score);
    }

    public void three_points_scoredB(View view){
        teamB_score += 3;
        displayForTeamB(teamB_score);
    }
    public void two_points_scoredA(View view) {
        teamA_score += 2;
        displayForTeamA(teamA_score);
    }

    public void two_points_scoredB(View view) {
        teamB_score += 2;
        displayForTeamB(teamB_score);
    }


    public void free_throw_scoredA(View view) {
        teamA_score += 1;
        displayForTeamA(teamA_score);
    }

    public void free_throw_scoredB(View view) {
        teamB_score += 1;
        displayForTeamB(teamB_score);
    }
}
