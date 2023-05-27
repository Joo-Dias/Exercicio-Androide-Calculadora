package com.example.exercicio_androide_calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText etValor1 = (EditText) findViewById(R.id.etValor1);
        etValor1.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

        EditText etOperacao = (EditText) findViewById(R.id.etOperacao);
        etOperacao.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

        EditText etValor2 = (EditText) findViewById(R.id.etValor2);
        etValor2.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

        Button btnCalcular = (Button) findViewById(R.id.btnCalcular);

        TextView tvResultado = (TextView) findViewById(R.id.tvResultado);

        btnCalcular.setOnClickListener(x -> calcular(etValor1, etOperacao, etValor2, tvResultado));
    }

    private void calcular(EditText etValor1, EditText etOperacao,EditText etValor2, TextView tvResultado){
        int valor1 = Integer.parseInt(etValor1.getText().toString());
        int valor2 = Integer.parseInt(etValor2.getText().toString());
        String operacao = etOperacao.getText().toString();
        int resultado = 0;

        /*
        if(operacao == "") {
            resultado = valor1 + valor2;
            tvResultado.setText(resultado);
        }else if(operacao == "-") {
            resultado = valor1 - valor2;
            tvResultado.setText(resultado);
        } else if(operacao == "*") {
            resultado = valor1 * valor2;
            tvResultado.setText(resultado);
        } else if(operacao == "/") {
            resultado = valor1 / valor2;
            tvResultado.setText(resultado);
        } else {
            Toast.makeText(getApplicationContext(), "Operação inválida!", Toast.LENGTH_SHORT).show();
            resultado = valor1 * valor2;
            String resultadoT = String.valueOf(resultado);
            tvResultado.setText(resultadoT);
        }
         */


        switch (operacao) {
            case "+":
                resultado = valor1 + valor2;
                String resultadoT = String.valueOf(resultado);
                tvResultado.setText(resultadoT);
                Toast.makeText(getApplicationContext(), "Operação concluída!", Toast.LENGTH_SHORT).show();
                break;
            case "-":
                resultado = valor1 - valor2;
                resultadoT = String.valueOf(resultado);
                tvResultado.setText(resultadoT);
                Toast.makeText(getApplicationContext(), "Operação concluída!", Toast.LENGTH_SHORT).show();
                break;
            case "*":
                resultado = valor1 * valor2;
                resultadoT = String.valueOf(resultado);
                tvResultado.setText(resultadoT);
                Toast.makeText(getApplicationContext(), "Operação concluída!", Toast.LENGTH_SHORT).show();
                break;
            case "/":
                resultado = valor1 / valor2;
                resultadoT = String.valueOf(resultado);
                tvResultado.setText(resultadoT);
                Toast.makeText(getApplicationContext(), "Operação concluída!", Toast.LENGTH_SHORT).show();
                break;
            default:
                Toast.makeText(getApplicationContext(), "Operação inválida!", Toast.LENGTH_SHORT).show();
        }

    }
}