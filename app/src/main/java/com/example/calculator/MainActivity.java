package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnsquare(View view) {
        Intent intent =new Intent(this, Square.class);
        startActivity(intent);
    }

    public void btntriangle(View view) {
        Intent intent =new Intent(this, Triangle.class);
        startActivity(intent);
    }

    public void btnrectangle(View view) {
        Intent intent = new Intent(this, Rectangle.class);
        startActivity(intent);
    }

    public void btncircle(View view) {
        Intent intent = new Intent(this, Circle.class);
        startActivity(intent);
    }
}