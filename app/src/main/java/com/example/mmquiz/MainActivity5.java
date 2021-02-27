package com.example.mmquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity5 extends AppCompatActivity {
    Button back3;
    TextView rezultate1,rezultate2,rezultate3,rezultate4,rezultate5,runde,runde2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        back3 = (Button) findViewById(R.id.back3);
        back3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity1();
            }
        });

        rezultate1=(TextView)findViewById(R.id.rezultate1) ;
        rezultate2=(TextView)findViewById(R.id.rezultate2) ;
        rezultate3=(TextView)findViewById(R.id.rezultate3) ;
        rezultate4=(TextView)findViewById(R.id.rezultate4) ;
        rezultate5=(TextView)findViewById(R.id.rezultate5) ;
        runde=(TextView)findViewById(R.id.runde) ;
        runde2=(TextView)findViewById(R.id.runde2) ;


        rezultate1.setText(MainActivity.history1+"/10");
        rezultate2.setText(MainActivity.history2+"/10");
        rezultate3.setText(MainActivity.history3+"/10");
        rezultate4.setText(MainActivity.history4+"/10");
        rezultate5.setText(MainActivity.history5+"/10");
        runde.setText(""+MainActivity.runde);
        runde2.setText(""+MainActivity.runde_perfecte);
    }

    private void openActivity1() {
        finish();
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}