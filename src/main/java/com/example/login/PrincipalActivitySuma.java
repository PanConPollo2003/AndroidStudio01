package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class PrincipalACtivitySuma extends AppCompatActivity implements View.OnClickListener {

    EditText edt1, edt2;
    TextView txt;
    Button btnSuma;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.principal_activity_suma);

        edt1 = findViewById(R.id.edtn1);
        edt2 = findViewById(R.id.edtn2);
        txt = findViewById(R.id.txtResultado);
        btnSuma = findViewById(R.id.btnSumar);

        btnSuma.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        float n1, n2, rest;
        n1 = Float.parseFloat(edt1.getText().toString());
        n2 = Float.parseFloat(edt2.getText().toString());
        rest = n1+n2;
        txt.setText(("El resultado de la suma es: "+rest));
        Toast.makeText(getApplicationContext(), "El resultado de la suma es: "+rest, Toast.LENGTH_LONG).show();
    }
}