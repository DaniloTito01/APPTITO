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

        String txtvalorBronze = bundle.getString("txtvalorBronze");
        String txtVidasBronze = bundle.getString("txtVidasBronze");
        String txtvalorPrata = bundle.getString("txtvalorPrata");
        String txtVidasPrata = bundle.getString("txtVidasPrata");
        String txtvalorOuro = bundle.getString("txtvalorOuro");
        String txtVidasOuro = bundle.getString("txtVidasOuro");



        TextView txtBronzeValor;
        TextView txtBronzeVidas;
        TextView txtPrataValor;
        TextView txtPrataVidas;
        TextView txtOuroValor;
        TextView txtOuroVidas;
        TextView txtValorTotal;
        TextView txtVidasTotal;



        double totalValorBronze;
        int totalVidasBronze;
        double totalValorPrata;
        int totalVidasPrata;
        double totalValorOuro;
        int totalVidasOuro;



        double totalValor;
        int totalVidas;


        txtBronzeValor =(TextView) findViewById(R.id.txtBronzeValor);
        txtBronzeVidas =(TextView) findViewById(R.id.txtBronzeVidas);
        txtPrataValor =(TextView) findViewById(R.id.txtPrataValor);
        txtPrataVidas =(TextView) findViewById(R.id.txtPrataVidas);
        txtOuroValor =(TextView) findViewById(R.id.txtOuroValor);
        txtOuroVidas =(TextView) findViewById(R.id.txtOuroVidas);



        txtValorTotal=(TextView) findViewById(R.id.txtValorTotal);
        txtVidasTotal =(TextView) findViewById(R.id.txtTotalVidas);

        totalValorBronze = Double.parseDouble(txtvalorBronze.toString());
        totalVidasBronze = Integer.parseInt(txtVidasBronze.toString());

     /*  if (!"".equals(txtVidasPrata.toString())&&!"".equals(txtvalorPrata.toString()) && txtPrataValor !=null ) {

            totalValorPrata = Double.parseDouble(txtvalorPrata.toString());
            totalVidasPrata = Integer.parseInt(txtVidasPrata.toString());
        }else {

           totalValorPrata = 0;
           totalVidasPrata =0;
       }*/

//Calculo Total
        totalValor = totalValorBronze * totalVidasBronze;



        txtBronzeValor.setText(txtvalorBronze);
        txtBronzeVidas.setText(txtVidasBronze);
        txtPrataValor.setText(txtvalorPrata);
        txtPrataVidas.setText(txtVidasPrata);
        txtOuroValor.setText(txtvalorOuro);
        txtOuroVidas.setText(txtVidasOuro);


        txtValorTotal.setText(""+totalValor);
        txtVidasTotal.setText(""+totalVidasBronze);





    }
}
