package com.hasan.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.hasan.mylibrary.SquareCalculator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.textView);

        int number = 5;
        int square = SquareCalculator.calculateSquare(number);

        textView.setText("Square: "+square);

        // Display the result (you would typically use a TextView)
        System.out.println("Square of " + number + " is: " + square);
    }
}