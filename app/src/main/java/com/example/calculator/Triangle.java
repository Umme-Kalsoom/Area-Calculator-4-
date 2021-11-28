package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Triangle extends AppCompatActivity {
    private EditText base;
    private EditText height;
    private Button calculate;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangle);
        base =(EditText) findViewById(R.id.tvbase);
        height = (EditText) findViewById(R.id.tvhgt);
        calculate = (Button) findViewById(R.id.btncal2);
        result = (TextView) findViewById(R.id.tvans2);
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            int bases = Integer.parseInt( base.getText().toString());
            int heights = Integer.parseInt( height.getText().toString());
            int area = (bases*heights)/2;
                result.setText(" answer " + String.valueOf(area));

            }
        });
    }

    public void btnback(View view) {
        Intent intent =new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}