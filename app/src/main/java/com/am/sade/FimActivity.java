package com.am.sade;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class FimActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fim);

        Intent intent = getIntent();

        Bundle bundle = intent.getExtras();

        String txt = bundle.getString("txt");
        String txt1 = bundle.getString("txt1");


        TextView txtBronzeValor;
        TextView txtBronzeVidas;

        txtBronzeValor =(TextView) findViewById(R.id.txtBronzeValor);
        txtBronzeVidas =(TextView) findViewById(R.id.txtBronzeVidas);

        txtBronzeValor.setText(txt);
        txtBronzeVidas.setText(txt1);


    }
}
