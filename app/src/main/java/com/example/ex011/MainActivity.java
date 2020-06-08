package com.example.ex011;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout color;
    Boolean b1= false;
    int sign=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        color= (LinearLayout) findViewById(R.id.color);
    }

    public void situation(View view) {
        if (b1)
            b1= false;
        else
            b1= true;
    }

    public void option1(View view) {
        sign=1;
        if (b1)
            color.setBackgroundColor(Color.WHITE);
    }

    public void option2(View view) {
        sign=2;
        if (b1)
            color.setBackgroundColor(Color.GRAY);
    }

    public void option3(View view) {
        sign=3;
        if (b1)
            color.setBackgroundColor(Color.BLUE);
    }

    public void option4(View view) {
        sign=4;
        if (b1)
            color.setBackgroundColor(Color.RED);
    }

    public void option5(View view) {
        if (!(b1)){
            if (sign==1)
                color.setBackgroundColor(Color.WHITE);
            else if (sign==2)
                color.setBackgroundColor(Color.GRAY);
            else if (sign==3)
                color.setBackgroundColor(Color.BLUE);
            else if (sign==4)
                color.setBackgroundColor(Color.RED);
        }

    }
}
