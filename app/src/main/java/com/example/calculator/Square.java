package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Square extends AppCompatActivity {
    private TextView result;
    private EditText side;
    private Button calculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_square);
        side = ( EditText) findViewById(R.id.etside);
        result=(TextView) findViewById(R.id.tvans);
        calculate = (Button) findViewById(R.id.btncal);
       calculate.setOnClickListener(new OnClickListener() {
           @Override
           public void onClick(View v) {
               int sides= Integer.parseInt( side.getText().toString());
               int square = sides * sides;
               result.setText(" answer " + String.valueOf(square));
           }
       });

    }

    public void btnbck(View view) {
        Intent intent =new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}