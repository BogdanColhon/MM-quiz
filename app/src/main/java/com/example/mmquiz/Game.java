package com.example.mmquiz;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

import static androidx.core.content.ContextCompat.startActivity;
/*
public class Game {

    Button answer1, answer2, answer3, answer4;
    TextView number, question;
    private questions mQuestions=new questions();
    private String mAnswer;
    private int mNumber=0;
    private int mQuestionsLength=mQuestions.mQuestions.length;
    Random r;
    protected void onCreate(Bundle savedInstanceState) {

        setContentView(R.layout.main);
    r=new Random();
    answer1 = (Button) findViewById(R.id.answer1);
    answer2 = (Button) findViewById(R.id.answer2);
    answer3 = (Button) findViewById(R.id.answer3);
    answer4 = (Button) findViewById(R.id.answer4);

    number = (TextView) findViewById(R.id.number);
    question = (TextView) findViewById(R.id.question);

    updateQuestion (r.nextInt(mQuestionsLength));

        answer1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (answer1.getText() == mAnswer) {
                mNumber++;
                number.setText("Number: " + mNumber);
                updateQuestion(r.nextInt(mQuestionsLength));
            }
        }
    });


                answer2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (answer2.getText() == mAnswer) {
                mNumber++;
                number.setText("Number: " + mNumber);
                updateQuestion(r.nextInt(mQuestionsLength));
            }
        }
    });


        answer3.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(answer3.getText()==mAnswer)
            {
                mNumber++;
                number.setText("Number: "+mNumber);
                updateQuestion(r.nextInt(mQuestionsLength));
            }

        }
    });


        answer4.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(answer4.getText()==mAnswer)
            {
                mNumber++;
                number.setText("Number: "+mNumber);
                updateQuestion(r.nextInt(mQuestionsLength));
            }

        }
    });

}
    private void updateQuestion(int num) {
        question.setText(mQuestions.getQuestion(num));
        answer1.setText(mQuestions.getChoice1(num));
        answer2.setText(mQuestions.getChoice2(num));
        answer3.setText(mQuestions.getChoice3(num));
        answer4.setText(mQuestions.getChoice4(num));

        mAnswer=mQuestions.getCorrectAnswer(num);
    }


}
*/
