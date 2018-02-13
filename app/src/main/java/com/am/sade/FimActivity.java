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

        TextView txtValorTotal;
        TextView txtVidasTotal;

        double totalValorBronze;
        int totalVidasBronze;

        double totalValor;
        int totalVidas;


        txtBronzeValor =(TextView) findViewById(R.id.txtBronzeValor);
        txtBronzeVidas =(TextView) findViewById(R.id.txtBronzeVidas);

        txtValorTotal=(TextView) findViewById(R.id.txtValorTotal);
        txtVidasTotal =(TextView) findViewById(R.id.txtTotalVidas);

       totalValorBronze = Double.parseDouble(txt.toString());
      totalVidasBronze = Integer.parseInt(txt1.toString());

//Calculo Total
        totalValor = totalValorBronze * totalVidasBronze;



        txtBronzeValor.setText(txt);
        txtBronzeVidas.setText(txt1);
        txtValorTotal.setText(""+totalValor);
        txtVidasTotal.setText(""+totalVidasBronze);





    }
}
