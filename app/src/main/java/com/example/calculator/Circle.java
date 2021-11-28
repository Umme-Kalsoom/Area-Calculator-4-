package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Circle extends AppCompatActivity {
    private EditText radius;
    private Button calculate;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle);
        radius = (EditText) findViewById(R.id.tvrdis);
        calculate = (Button) findViewById(R.id.btncal4);
        result = (TextView) findViewById(R.id.tvans4);
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int radiuses =Integer.parseInt( radius.getText().toString());
                double area = 3.1428*(radiuses*radiuses);
                result.setText("answer " + String.valueOf(area));

            }
        });
    }

    public void btnback(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}