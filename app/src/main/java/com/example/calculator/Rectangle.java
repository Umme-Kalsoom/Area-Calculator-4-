package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Rectangle extends AppCompatActivity {
    private EditText length;
    private EditText heigth;
    private Button calculation;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectangle);
        length = (EditText) findViewById(R.id.etlen);
        heigth = (EditText) findViewById(R.id.ethegth);
        calculation = (Button) findViewById(R.id.btncal3);
        result = (TextView) findViewById(R.id.tvans3);
        calculation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int lengths= Integer.parseInt( length.getText().toString());
                int heigths= Integer.parseInt( heigth.getText().toString());
                int area = lengths*heigths;
                result.setText(" answer " + String.valueOf(area));
            }
        });
    }

    public void btnback(View view) {
        Intent intent= new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}