package com.example.mmquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    TextView score;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Intent intent=getIntent();
      //  int scor=intent.getIntExtra(MainActivity2.EXTRA_NUMBER,0);
        //score.setText(" Intrebarea: " + MainActivity2.mScore+ "/9");
    }
}