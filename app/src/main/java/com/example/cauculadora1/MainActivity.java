package com.example.cauculadora1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText txt1;
EditText txt2;
Button btnsoma;
Button btnSub;
Button btnmult;
Button btndiv;
TextView Result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt1 = findViewById(R.id.txtnmro1);
        txt2 = findViewById(R.id.txtnmro2);
        btnSub = findViewById(R.id.btnSubtrai);
        btnmult = findViewById(R.id.btnMultip);
        btndiv = findViewById(R.id.btnDiv);
        Result = findViewById(R.id.txResult);
    }
    public void somar(){
        int valor1 =Integer.parseInt(txt1.getText().toString());
        int valor2 =Integer.parseInt(txt1.getText().toString());
double resultado = valor1+valor2;
        Result.setText(String.valueOf(resultado));
    }
}