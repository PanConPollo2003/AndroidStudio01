package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class PrincipalActivity extends AppCompatActivity {


    TextView txtDato;
    Button btnSuma,btnRaiz,btnImparPar,btnEspacio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.principal_activity);
        txtDato= findViewById(R.id.txtView);
        Bundle recibeDato = getIntent().getExtras();
        String info = recibeDato.getString("keydatos");
        txtDato.setText(info);

        btnImparPar = findViewById(R.id.btnImparPar);
        btnImparPar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), PrincipalActivityImparPar.class);
                startActivity(intent);
            }
        });
        btnEspacio = findViewById(R.id.btnEspacio);
        btnEspacio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //        Intent intent = new Intent(getApplicationContext(), MainActivity6Espacios.class);
                //        startActivity(intent);
            }
        });
        btnRaiz = findViewById(R.id.btnRaiz);
        btnRaiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), PrincipalActivityRaiz.class);
                startActivity((intent));
            }
        });
        btnSuma = findViewById(R.id.btnSuma);
        btnSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), PrincipalActivitySuma.class);
                startActivity(intent);
            }

        });
    }
}