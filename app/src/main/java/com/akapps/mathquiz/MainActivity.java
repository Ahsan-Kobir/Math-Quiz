package com.akapps.mathquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    public int myPoint, opPoint = 0;
    Button b1,b2,b3,b4,b5,b6;
    TextView question,question2,point,point2;
    int answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.button);
        b2 = findViewById(R.id.button2);
        b3 = findViewById(R.id.button3);
        b4 = findViewById(R.id.button4);
        b5 = findViewById(R.id.button5);
        b6 = findViewById(R.id.button6);
        question = findViewById(R.id.question);
        question2 = findViewById(R.id.question2);
        point = findViewById(R.id.point);
        point2 = findViewById(R.id.point2);

        genQues();

    }

    public void setQuiz(){

    }

    void genQues(){
        //Generating the quiz
        Random random = new Random();
        int fnum = random.nextInt(1000);
        int snum = random.nextInt(1000);
        if(random.nextBoolean()==true){
            question.setText(fnum + " + " + snum +" = ?");
            question2.setText(fnum + " + " + snum +" = ?");
            answer = fnum + snum;
            int[] ansss = new int[]{answer, random.nextInt(answer), random.nextInt(answer-fnum)};
            setButtons(ansss);
        } else {
            question.setText(fnum + " - " + snum +" = ?");
            question2.setText(fnum + " - " + snum +" = ?");
            answer = fnum - snum;
            int[] ansss = new int[]{answer, random.nextInt(answer), random.nextInt(answer-fnum)};
            setButtons(ansss);
        }

    }
    void setButtons(int[] nums){

//        b1.setText(p1);
//        b2.setText(p2);
//        b3.setText(p3);
//
//        b4.setText(p1);
//        b5.setText(p2);
//        b6.setText(p3);
    }
}