package com.example.mmquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MeniuGame extends AppCompatActivity {
    Button management,marketing,ambele,back4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meniu_game);
        management = (Button) findViewById(R.id.management);
        marketing = (Button) findViewById(R.id.marketing);
        ambele = (Button) findViewById(R.id.ambele);
        back4 = (Button) findViewById(R.id.back4);
        management.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.runde+=1;

                //save runde
                SharedPreferences mRunde=getSharedPreferences("TotalRunde", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor=mRunde.edit();
                editor.putInt("runde",MainActivity.runde);
                editor.commit();
                openActivity2();
            }
        });

        marketing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.runde+=1;

                //save runde
                SharedPreferences mRunde=getSharedPreferences("TotalRunde", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor=mRunde.edit();
                editor.putInt("runde",MainActivity.runde);
                editor.commit();
                openMarketing();
            }
        });

        ambele.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.runde+=1;

                //save runde
                SharedPreferences mRunde=getSharedPreferences("TotalRunde", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor=mRunde.edit();
                editor.putInt("runde",MainActivity.runde);
                editor.commit();
                openAmbele();
            }
        });
        back4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity1();
            }
        });
    }
    private void openActivity1() {
        finish();
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }
    private void openActivity2() {
        finish();
        Intent intent=new Intent(this,MainActivity2.class);
        startActivity(intent);
    }
    private void openMarketing() {
        finish();
        Intent intent=new Intent(this,Marketing.class);
        startActivity(intent);
    }
    private void openAmbele() {
        finish();
        Intent intent=new Intent(this,Ambele.class);
        startActivity(intent);
    }
}