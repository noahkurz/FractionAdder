package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.view.View;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity {
    public String age, weight, height, name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      //  answer = new Fraction(1, 2);
       // answer2 = new Fraction(1, 4);
       // finalAnswer = answer.add(answer2);

    }

    public void onClickMe(View v) {



        EditText name = findViewById(R.id.name);
        EditText age = findViewById(R.id.employ_age);
        EditText height = findViewById(R.id.employ_height);
        EditText weight = findViewById(R.id.employ_weight);

        TextView Agetxt = findViewById(R.id.agetxt);
        //employ_info.setText("" + name +  age +  height+  weight);
        Agetxt.setText(age.getText());

        TextView Nametxt = findViewById(R.id.nametxt);
        TextView Weighttxt = findViewById(R.id.weighttxt);
        TextView Heighttxt = findViewById(R.id.heighttxt);
        Nametxt.setText(name.getText());
        Weighttxt.setText(weight.getText());
        Heighttxt.setText(height.getText());

    }

}
