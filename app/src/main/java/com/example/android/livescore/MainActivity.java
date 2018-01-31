package com.example.android.livescore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreManCity = 0;
    int scoreChelsea = 0;
    int yellowManCity = 0;
    int yellowChelsea = 0;
    int redManCity = 0;
    int redChelsea = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
    *This method is called when button with Manchester City logo is clicked.
    */
    public void displayScoreForManCity (int score) {
        TextView scoreView = (TextView) findViewById(R.id.manCity_score);
        scoreView.setText(String.valueOf(score));
    }
    /*Display score of Manchester City.
     */
    public void oneGoalManCity (View view) {
        scoreManCity = scoreManCity + 1;
        displayScoreForManCity (scoreManCity);
    }

    /**
     *This method is called when button with Chelsea logo is clicked.
     */
    public void displayScoreForChelsea (int score) {
        TextView scoreView = (TextView) findViewById(R.id.chelsea_score);
        scoreView.setText(String.valueOf(score));
    }

    /*Display score of Chelsea.
     */

    public void oneGoalChelsea (View view) {
        scoreChelsea = scoreChelsea + 1;
        displayScoreForChelsea (scoreChelsea);
    }
    /**
     *This method is called when yellowcard for Manchester City is clicked.
     */
    public void displayYellowForManCity (int score) {
        TextView scoreView = (TextView) findViewById(R.id.manCity_yellowCard);
        scoreView.setText(String.valueOf(score));
    }
    /*Display score of Manchester City.
     */
    public void oneYellowManCity (View view) {
        yellowManCity = yellowManCity + 1;
        displayYellowForManCity (yellowManCity);
    }
    public void displayYellowForChelsea (int score) {
        TextView scoreView = (TextView) findViewById(R.id.chelsea_yellowCard);
        scoreView.setText(String.valueOf(score));
    }
    public void oneYellowChelsea (View view) {
        yellowChelsea = yellowChelsea + 1;
        displayYellowForChelsea (yellowChelsea);
    }

    /*Display score of Manchester City.
     */

    public void displayRedForManCity (int score) {
        TextView scoreView = (TextView) findViewById(R.id.manCity_redCard);
        scoreView.setText(String.valueOf(score));
    }
    public void oneRedManCity (View view) {
        redManCity = redManCity + 1;
        displayRedForManCity (redManCity);
    }

    public void displayRedForChelsea (int score) {
        TextView scoreView = (TextView) findViewById(R.id.chelsea_redCard);
        scoreView.setText(String.valueOf(score));
    }
    public void oneRedChelsea (View view) {
        redChelsea = redChelsea + 1;
        displayRedForChelsea (redChelsea);
    }

    public void resetAll (View view){
    scoreManCity = 0;
    scoreChelsea = 0;
    yellowManCity = 0;
    yellowChelsea = 0;
    redManCity = 0;
    redChelsea = 0;
    displayScoreForManCity (scoreManCity);
    displayScoreForChelsea (scoreChelsea);
    displayYellowForManCity (yellowManCity);
    displayYellowForChelsea (yellowChelsea);
    displayRedForManCity (redManCity);
    displayRedForChelsea (redChelsea);
    }
}
