package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class PrincipalActivityImparPar extends AppCompatActivity implements View.OnClickListener {
    EditText edt1;
    TextView txt;
    Button btnImparPar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.principal_activity_impar_par);

        edt1= (findViewById(R.id.edtImparpar));
        txt= (findViewById(R.id.txtparimpar));
        btnImparPar= (findViewById(R.id.btncalcularimparpar));
        btnImparPar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int n1, res;
        n1= Integer.parseInt(edt1.getText().toString());
        if((n1%2==0)){
            txt.setText("El numero que coloco es par :)!");
            Toast.makeText(getApplicationContext(), "El numero que coloco es par :)!",Toast.LENGTH_LONG).show();
        }else
            txt.setText("El numero que coloco es impar :)!");
            Toast.makeText(getApplicationContext(), "El numero que coloco es impar :)!", Toast.LENGTH_LONG).show();




    }
}