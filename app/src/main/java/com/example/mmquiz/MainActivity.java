package com.example.mmquiz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.FontResourcesParserCompat;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button play_button, stats, rasp;
    public static int runde = 0;
    public static int runde_perfecte = 0;
    public static int history1 = 0;
    public static int history2 = 0;
    public static int history3 = 0;
    public static int history4 = 0;
    public static int history5 = 0;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        play_button = (Button) findViewById(R.id.play_button);
        stats = (Button) findViewById(R.id.stats);
        rasp = (Button) findViewById(R.id.rasp);
        SharedPreferences mRunde = this.getSharedPreferences("TotalRunde", Context.MODE_PRIVATE);
        runde = mRunde.getInt("runde", 0);
        SharedPreferences mRunde_perfecte = this.getSharedPreferences("RundePerfecte", Context.MODE_PRIVATE);
        runde_perfecte = mRunde_perfecte.getInt("runde_perfecte", 0);

        SharedPreferences mHistory1 = this.getSharedPreferences("History1", Context.MODE_PRIVATE);
        history1 = mHistory1.getInt("history1", 0);
        SharedPreferences mHistory2 = this.getSharedPreferences("History2", Context.MODE_PRIVATE);
        history2 = mHistory2.getInt("history2", 0);
        SharedPreferences mHistory3 = this.getSharedPreferences("History3", Context.MODE_PRIVATE);
        history3 = mHistory3.getInt("history3", 0);
        SharedPreferences mHistory4 = this.getSharedPreferences("History4", Context.MODE_PRIVATE);
        history4 = mHistory4.getInt("history4", 0);
        SharedPreferences mHistory5 = this.getSharedPreferences("History5", Context.MODE_PRIVATE);
        history5 = mHistory5.getInt("history5", 0);


        play_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMeniuGame();
            }
        });
        stats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity5();
            }
        });
        rasp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRaspunsuri();
            }
        });

    }

    private void openMeniuGame() {
        finish();
        Intent intent = new Intent(this, MeniuGame.class);
        startActivity(intent);
    }

    private void openActivity5() {
        finish();
        Intent intent = new Intent(this, MainActivity5.class);
        startActivity(intent);
    }

    private void openRaspunsuri() {
        finish();
        Intent intent = new Intent(this, Raspunsuri.class);
        startActivity(intent);
    }

}