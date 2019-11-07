package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity {

    private Fraction answer, answer2, finalAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      //  answer = new Fraction(1, 2);
       // answer2 = new Fraction(1, 4);
       // finalAnswer = answer.add(answer2);

    }

    public void onClickMe(View v) {



        EditText num1 = findViewById(R.id.num1);
        EditText num2 = findViewById(R.id.num2);
        EditText denom1 = findViewById(R.id.denom1);
        EditText denom2 = findViewById(R.id.denom2);
        answer = new Fraction(Integer.parseInt(num1.getText().toString()), Integer.parseInt(denom1.getText().toString()));
        answer2 = new Fraction(Integer.parseInt(num2.getText().toString()), Integer.parseInt(denom2.getText().toString()));
        finalAnswer = answer.add(answer2);
        TextView answerbox = findViewById(R.id.Answer);
        answerbox.setText(finalAnswer.toString());




    }

}
