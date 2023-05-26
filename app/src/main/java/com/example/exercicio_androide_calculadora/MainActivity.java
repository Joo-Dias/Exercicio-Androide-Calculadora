package com.example.exercicio_androide_calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText etValor1 = (EditText) findViewById(R.id.etValor1);
        EditText etOperacao = (EditText) findViewById(R.id.etOperacao);
        EditText etValor2 = (EditText) findViewById(R.id.etValor2);
        Button btnCalcular = (Button) findViewById(R.id.btnCalcular);

    }
}