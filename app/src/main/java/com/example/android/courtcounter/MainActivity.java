package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;


public class MainActivity extends AppCompatActivity {
    //Initializing the score of team a
    int scoreTeamA = 0;
    //Initializing the score of team b
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
/**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Increase the score for Team A by 1 point.
     */
    public void addOneForTeamA(View v) {
        displayForTeamA(1);
        scoreTeamA=scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the score for Team A by 2 points.
     */
    public void addTwoForTeamA(View v) {
        displayForTeamA(2);
        scoreTeamA=scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the score for Team A by 3 points.
     */
    public void addThreeForTeamA(View v) {
        displayForTeamA(3);
        scoreTeamA=scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the score for Team B by 2 points.
     */
    public void addOneForTeamB(View v) {
        displayForTeamB(1);
        scoreTeamB=scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }
    /**
     * Increase the score for Team B by 2 points.
     */
    public void addTwoForTeamB(View v) {
        displayForTeamB(2);
        scoreTeamB=scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }
    /**
     * Increase the score for Team B by 3 points.
     */
    public void addThreeForTeamB(View v) {
        displayForTeamB(3);
        scoreTeamB=scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }
    /**
     * Resets the scores of both teams to zero.
     */
    public void resetScore(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}

