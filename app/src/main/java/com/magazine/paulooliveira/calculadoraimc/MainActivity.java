package com.magazine.paulooliveira.calculadoraimc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnCalcularOnClick(View view){

        EditText txtAltura = (EditText) findViewById(R.id.txtAltura);
        EditText txtPeso = (EditText) findViewById(R.id.txtPeso);

        double altura = Double.parseDouble(txtAltura.getText().toString());
        int peso = Integer.parseInt(txtPeso.getText().toString());

        double imc = peso / Math.pow(altura, 2);//Peso dividido por altura ao quadrado
        if (imc < 16){
            Toast.makeText(this,
                    "Magreza Grave!",
                    Toast.LENGTH_SHORT).show();

        }else if(imc < 17 ){
            Toast.makeText(this,
                    "Magreza moderada",
                    Toast.LENGTH_SHORT).show();

        }else if (imc < 18.5){
            Toast.makeText(this,
                    "Magreza leve!",
                    Toast.LENGTH_SHORT).show();

        }else if (imc < 25){
            Toast.makeText(this,
                    "Saudável!",
                    Toast.LENGTH_SHORT).show();

        }else if (imc < 30){
            Toast.makeText(this,
                    "Sobrepeso!",
                    Toast.LENGTH_SHORT).show();

        }else if (imc < 35){
            Toast.makeText(this,
                    "Obesidade Grau I!",
                    Toast.LENGTH_SHORT).show();

        }else if (imc < 40){
            Toast.makeText(this,
                    "Obesidade Grau II!",
                    Toast.LENGTH_SHORT).show();

        } else {
            Toast.makeText(this,
                    "Obesidade Grau III",
                    Toast.LENGTH_SHORT).show();
        }
    }
}

