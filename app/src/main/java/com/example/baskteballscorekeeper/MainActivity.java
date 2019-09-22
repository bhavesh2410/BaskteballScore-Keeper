package com.example.baskteballscorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    int a=0,b=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void threeTeamA(View v){
        a=a+3;
        displayScoreA(a);
    }

    public void twoTeamA(View v){
        a=a+2;
        displayScoreA(a);
    }

    public void freethrowTeamA(View v){
        a=a+1;
        displayScoreA(a);
    }

    public void threeTeamB(View v){
        b=b+3;
        displayScoreB(b);
    }

    public void twoTeamB(View v){
        b=b+2;
        displayScoreB(b);
    }

    public void freethrowTeamB(View v){
        b=b+1;
        displayScoreB(b);
    }

    public void reset(View v){
        a=0;
        b=0;
        displayScoreA(a);
        displayScoreB(b);
    }
    public void displayScoreA(int a) {
        TextView scorea=(TextView) findViewById(R.id.scoreA);

        scorea.setText(String.valueOf(a));
    }


    public void displayScoreB(int b) {

        TextView scoreb = (TextView) findViewById(R.id.scoreB);

        scoreb.setText(String.valueOf(b));
    }
    }