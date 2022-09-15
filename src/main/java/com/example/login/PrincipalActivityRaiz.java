package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class PrincipalActivityRaiz extends AppCompatActivity implements View.OnClickListener {

    EditText edt1;
    Button btnRaiz;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.principal_activity_raiz);

        edt1 = (findViewById(R.id.edtRaiz));
        txt=(findViewById(R.id.txtResultadoRaiz));
        btnRaiz = (findViewById(R.id.btnCalcularRaiz));
        btnRaiz.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        float n1, res;
        n1 = Float.parseFloat(edt1.getText().toString());
        res= (float) Math.sqrt(n1);
        txt.setText("El resultado de la raiz es: "+res);
        Toast.makeText(getApplicationContext(), "El resultado de la raiz es: "+res, Toast.LENGTH_LONG).show();

    }
}