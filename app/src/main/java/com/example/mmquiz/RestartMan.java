package com.example.mmquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RestartMan extends AppCompatActivity {
    Button back2,restart;
    TextView rezultat;

    public static int[] rezultate = new int[6];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restart_man);
        rezultat=(TextView)findViewById(R.id.rezultat) ;
        Intent intent3=getIntent();
        int scor=intent3.getIntExtra(MainActivity2.EXTRA_NUMBER,0);
        rezultat.setText(scor+"/10");
        back2 = (Button) findViewById(R.id.back2);
        MainActivity.history5=MainActivity.history4;
        SharedPreferences mHistory5=getSharedPreferences("History5",Context.MODE_PRIVATE);
        SharedPreferences.Editor editor6=mHistory5.edit();
        editor6.putInt("history5",MainActivity.history5);
        editor6.commit();

        MainActivity.history4=MainActivity.history3;
        SharedPreferences mHistory4=getSharedPreferences("History4",Context.MODE_PRIVATE);
        SharedPreferences.Editor editor7=mHistory4.edit();
        editor7.putInt("history4",MainActivity.history4);
        editor7.commit();

        MainActivity.history3=MainActivity.history2;
        SharedPreferences mHistory3=getSharedPreferences("History3",Context.MODE_PRIVATE);
        SharedPreferences.Editor editor8=mHistory3.edit();
        editor8.putInt("history3",MainActivity.history3);
        editor8.commit();

        MainActivity.history2=MainActivity.history1;
        SharedPreferences mHistory2=getSharedPreferences("History2",Context.MODE_PRIVATE);
        SharedPreferences.Editor editor9=mHistory2.edit();
        editor9.putInt("history2",MainActivity.history2);
        editor9.commit();

        MainActivity.history1=scor;
        SharedPreferences mHistory1=getSharedPreferences("History1",Context.MODE_PRIVATE);
        SharedPreferences.Editor editor5=mHistory1.edit();
        editor5.putInt("history1",MainActivity.history1);
        editor5.commit();

        back2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(scor==10)
                {
                    MainActivity.runde_perfecte++;
                    SharedPreferences mRunde_perfecte=getSharedPreferences("RundePerfecte",Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor2=mRunde_perfecte.edit();
                    editor2.putInt("runde_perfecte",MainActivity.runde_perfecte);
                    editor2.commit();
                }
                openActivity1();
            }
        });
        restart = (Button) findViewById(R.id.restart);
        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.runde+=1;

                //save runde
                SharedPreferences mRunde=getSharedPreferences("TotalRunde", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor=mRunde.edit();
                editor.putInt("runde",MainActivity.runde);
                editor.commit();

                //save runde perfecte
                if(scor==10)
                {
                    MainActivity.runde_perfecte++;
                    SharedPreferences mRunde_perfecte=getSharedPreferences("RundePerfecte",Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor2=mRunde_perfecte.edit();
                    editor2.putInt("runde_perfecte",MainActivity.runde_perfecte);
                    editor2.commit();
                }
                openMarketing();
            }
        });



    }
    private void openActivity1() {
        finish();
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }
    private void openMarketing() {
        finish();
        Intent intent2=new Intent(this,Marketing.class);
        startActivity(intent2);
    }
}