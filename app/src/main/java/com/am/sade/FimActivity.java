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

        String valorBronze = intent.getStringExtra("valorBronze");
        String bntBronzeVidas = intent.getStringExtra("bntBronzeVidas");


        TextView txtBronzeValor;
        TextView txtBronzeVidas;

        txtBronzeValor =(TextView) findViewById(R.id.txtBronzeValor);
        txtBronzeVidas =(TextView) findViewById(R.id.txtBronzeVidas);

        txtBronzeValor.setText("0");
        txtBronzeVidas.setText("0");


    }
}
