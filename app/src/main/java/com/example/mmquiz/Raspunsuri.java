package com.example.mmquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Raspunsuri extends AppCompatActivity {
    Button back5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_raspunsuri);
        back5 = (Button) findViewById(R.id.back5);
        back5.setOnClickListener(new View.OnClickListener() {
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
}