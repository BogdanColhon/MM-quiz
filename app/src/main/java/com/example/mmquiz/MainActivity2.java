package com.example.mmquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class MainActivity2 extends AppCompatActivity {

    public static final String EXTRA_NUMBER ="" ;
    Button answer1, answer2, answer3, answer4,back;
    TextView number, question;
    private questions mQuestions=new questions();
    private String mAnswer;
    private int mNumber=1;
    private int mScore=0;
    private int contor=0;
   // public static int mScore=0;
    private int mQuestionsLength=mQuestions.mQuestions.length;
    Random r;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main2);
            back = (Button) findViewById(R.id.back);
            back.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    openMeniuGame();
                }
            });

            r = new Random();
            answer1 = (Button) findViewById(R.id.answer1);
            answer2 = (Button) findViewById(R.id.answer2);
            answer3 = (Button) findViewById(R.id.answer3);
            answer4 = (Button) findViewById(R.id.answer4);

            number = (TextView) findViewById(R.id.number);
            question = (TextView) findViewById(R.id.question);
            Integer[] arr = new Integer[10];
        for (int i = 0; i < 10;i++) {
            arr[i] = i;
        }
        Collections.shuffle(Arrays.asList(arr));
        //System.out.println(Arrays.toString(arr));
            updateQuestion(arr[contor]);
            number.setText(" Întrebarea: " + mNumber + "/10");

            answer1.setOnClickListener(new View.OnClickListener() {

                @Override

                public void onClick(View view) {

                    if (answer1.getText() == mAnswer) {
                        mScore++;
                        if(mNumber==10)
                        {
                            finish();
                            openActivity3();
                        }
                        else
                        {
                        mNumber++;
                        number.setText(" Întrebarea " + mNumber + "/10");
                        updateQuestion(arr[contor]);
                    } }else {
                        if(mNumber==10)
                        {
                            finish();
                            openActivity3();
                        }
                        else
                        {
                        mNumber++;
                        number.setText(" Întrebarea " + mNumber + "/10");
                        updateQuestion(arr[contor]);
                    }}
                }

            });


            answer2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (answer2.getText() == mAnswer) {
                        mScore++;
                        if(mNumber==10)
                        {
                            finish();
                            openActivity3();
                        }else
                        {
                        mNumber++;
                        number.setText(" Întrebarea: " + mNumber + "/10");
                        updateQuestion(arr[contor]);
                    }} else {
                        if(mNumber==10)
                        {
                            finish();
                            openActivity3();
                        }
                        else
                        {
                        mNumber++;
                        number.setText(" Întrebarea " + mNumber + "/10");
                        updateQuestion(arr[contor]);
                    }}
                }
            });


            answer3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (answer3.getText() == mAnswer) {
                        mScore++;
                        if(mNumber==10)
                        {
                            finish();
                            openActivity3();
                        }
                        else
                        {
                        mNumber++;
                        number.setText(" Întrebarea: " + mNumber + "/10");
                        updateQuestion(arr[contor]);
                    }} else {
                        if(mNumber==10)
                        {
                            finish();
                            openActivity3();
                        }
                        else{
                        mNumber++;
                        number.setText(" Întrebarea " + mNumber + "/10");
                        updateQuestion(arr[contor]);
                    }}

                }
            });


            answer4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (answer4.getText() == mAnswer) {
                        mScore++;
                        if(mNumber==10)
                        {
                            finish();
                            openActivity3();
                        }
                        else
                        {
                        mNumber++;
                        number.setText(" Întrebarea: " + mNumber + "/10");
                        updateQuestion(arr[contor]);
                    }} else {
                        if(mNumber==10)
                        {
                            finish();
                            openActivity3();
                        }
                        else
                        {
                        mNumber++;
                        number.setText(" Întrebarea " + mNumber + "/10");
                        updateQuestion(arr[contor]);
                    }}

                }
            });


        }







    private void updateQuestion(int num) {
    contor++;
            question.setText(mQuestions.getQuestion(num));
            answer1.setText(mQuestions.getChoice1(num));
            answer2.setText(mQuestions.getChoice2(num));
            answer3.setText(mQuestions.getChoice3(num));
            answer4.setText(mQuestions.getChoice4(num));

            mAnswer = mQuestions.getCorrectAnswer(num);

    }

    private void openMeniuGame() {
        finish();
        Intent intent=new Intent(this,MeniuGame.class);
        startActivity(intent);
    }
    private void openActivity3() {
        finish();
        Intent intent2=new Intent(this,MainActivity4.class);
        intent2.putExtra(EXTRA_NUMBER,mScore);
        startActivity(intent2);
    }
    }

