package com.am.sade;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.am.saude.MainActivity;

import java.text.DecimalFormat;

public class FimActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fim);

        Button btnNovoCalculo;

        DecimalFormat df = new DecimalFormat("0.##");

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

        btnNovoCalculo = (Button) findViewById(R.id.bntNovoCalculo);



        txtValorTotal=(TextView) findViewById(R.id.txtValorTotal);
        txtVidasTotal =(TextView) findViewById(R.id.txtTotalVidas);

        totalValorBronze = Double.parseDouble(txtvalorBronze.toString());
        totalVidasBronze = Integer.parseInt(txtVidasBronze.toString());
        totalValorPrata = Double.parseDouble(txtvalorPrata.toString());
        totalVidasPrata = Integer.parseInt(txtVidasPrata.toString());
        totalValorOuro = Double.parseDouble(txtvalorOuro.toString());
        totalVidasOuro = Integer.parseInt(txtVidasOuro.toString());


//Calculo Total
        totalValor = (totalValorBronze * totalVidasBronze) + (totalValorPrata * totalVidasPrata)
                + (totalValorOuro * totalVidasOuro) ;

        totalVidas = totalVidasBronze + totalVidasPrata + totalVidasOuro;



        txtBronzeValor.setText(txtvalorBronze);
        txtBronzeVidas.setText(txtVidasBronze);
        txtPrataValor.setText(txtvalorPrata);
        txtPrataVidas.setText(txtVidasPrata);
        txtOuroValor.setText(txtvalorOuro);
        txtOuroVidas.setText(txtVidasOuro);


        txtValorTotal.setText(""+df.format(totalValor));
        txtVidasTotal.setText(""+totalVidas);

        btnNovoCalculo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);


            }
        });


    }
}
