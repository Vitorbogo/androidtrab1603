package com.example.trabalho_1603;

import android.graphics.Color;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class IMCMainActivity extends AppCompatActivity {
    private Button buttonCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_i_m_c_main);

        buttonCalcular = (Button) findViewById(R.id.button5);
        buttonCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText campoAltura = (EditText) findViewById(R.id.editTextAltura);
                EditText campoPeso = (EditText) findViewById(R.id.editTextPeso);
                TextView resultado = (TextView) findViewById(R.id.textViewResultado);
                if(campoAltura.getText().toString().isEmpty() && campoPeso.getText().toString().isEmpty())
                {
                    buttonCalcular = (Button) findViewById(R.id.button5);
                    buttonCalcular.setEnabled(false);
                }else
                {
                    buttonCalcular = (Button) findViewById(R.id.button5);
                    buttonCalcular.setEnabled(true);
                }

                /*resultado = campoAltura / ( campoPeso * campoPeso);
                * resultado < 20 = roxo
                * resultado > 25 = vermelho
                * resultado < 25 && > 20 = azul*/
                if (resultado.getText() < 20)
                {

                }
            }
        });


    }
}
