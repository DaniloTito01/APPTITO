package com.am.saude;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.am.sade.FimActivity;
import com.am.sade.R;




public class MainActivity extends AppCompatActivity {

    Spinner uf;
    Spinner cid;
    Spinner pme;
    Spinner plano;
    Spinner temPlano;
    EditText txtBronze;

    EditText txtPrata;
    EditText txtOuro;
    private Button btnCalculo;
    int verificadorUF;

    //Valor
    double valorBronze;
    double valorPrata;
    double valorOuro;

    //btn
    int bntBronzeVidas;
    int bntUf ;
    int bntCid ;
    int bntPme ;
    int bntTipoPlano ;
    int bntTemPlano ;
    int bntPrata ;
    int bntOuro ;

    // CheckBox

    CheckBox bronzeCkb;
    CheckBox prataCkb;
    CheckBox ouroCkb;


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtBronze = (EditText) findViewById(R.id.editText);
        txtPrata = (EditText) findViewById(R.id.editText2);
        txtOuro = (EditText) findViewById(R.id.editText3);

        bronzeCkb = (CheckBox)findViewById(R.id.cbxBronze);
        prataCkb = (CheckBox)findViewById(R.id.cbxPrata);
        ouroCkb = (CheckBox)findViewById(R.id.cbxOuro);



        btnCalculo = (Button) findViewById(R.id.bntCalcular);
        btnCalculo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calculo();




            }
        });

        uf = (Spinner) findViewById(R.id.spinUf);
        final ArrayAdapter adapterUF = ArrayAdapter.createFromResource(this,R.array.Uf,android.R.layout.simple_spinner_item);
        uf.setAdapter(adapterUF);

        uf.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                verificadorUF = i;

                switch (verificadorUF){
                    case 0: cid = (Spinner) findViewById(R.id.spinCidade);
                        ArrayAdapter adapterCid = ArrayAdapter.createFromResource(getApplicationContext(),R.array.Cidade,android.R.layout.simple_spinner_item);
                        cid.setAdapter(adapterCid);


                        break;


                    case 1: cid = (Spinner) findViewById(R.id.spinCidade);
                        ArrayAdapter adapterCidMs = ArrayAdapter.createFromResource(getApplicationContext(),R.array.CidadeMS,android.R.layout.simple_spinner_item);
                        cid.setAdapter(adapterCidMs);

                /*Faz alguma coisa*/
                        break;


                    case 2: cid = (Spinner) findViewById(R.id.spinCidade);
                        ArrayAdapter adapterCidMG = ArrayAdapter.createFromResource(getApplicationContext(),R.array.CidadeMG,android.R.layout.simple_spinner_item);
                        cid.setAdapter(adapterCidMG);

                /*Faz alguma coisa*/
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


        pme = (Spinner) findViewById(R.id.spinPme);
        ArrayAdapter adapterPme = ArrayAdapter.createFromResource(this,R.array.PME,android.R.layout.simple_spinner_item);
        pme.setAdapter(adapterPme);

        plano = (Spinner) findViewById(R.id.spinPlano);
        ArrayAdapter adapterPlano = ArrayAdapter.createFromResource(this,R.array.Plano,android.R.layout.simple_spinner_item);
        plano.setAdapter(adapterPlano);

        temPlano = (Spinner) findViewById(R.id.spinTemPlano);
        ArrayAdapter adapterTemPlano = ArrayAdapter.createFromResource(this,R.array.TemPlano,android.R.layout.simple_spinner_item);
        temPlano.setAdapter(adapterTemPlano);

    }

    public void Calculo() {

        bntUf = uf.getSelectedItemPosition();
        bntCid = cid.getSelectedItemPosition();
        bntPme = pme.getSelectedItemPosition();
        bntTipoPlano = plano.getSelectedItemPosition();
        bntTemPlano = temPlano.getSelectedItemPosition();

        //Calculo SP,Sao Paulo,100%,10 a 29 Vidas,Sim.
        if (bntUf == 0 && bntCid == 0 && bntPme == 0 && bntTipoPlano == 0 && bntTemPlano == 0) {

            if (bronzeCkb.isChecked() == true || prataCkb.isChecked() == true || ouroCkb.isChecked() == true) {

                //bronze començo
                if (bronzeCkb.isChecked() == true) {


                    if (!"".equals(txtBronze.getText().toString())) {

                        bntBronzeVidas = Integer.parseInt(txtBronze.getText().toString());

                        valorBronze = 14.60;

                        Ok();






                        //Toast.makeText(getApplicationContext(), " valorBronze2:", Toast.LENGTH_SHORT).show();

                    } else {
                        Toast.makeText(getApplicationContext(), "Digite a Qtd de Vidas", Toast.LENGTH_SHORT).show();
                    }
                }
                // Fim Bronze

                if (prataCkb.isChecked() == true) {

                    if (!"".equals(txtPrata.getText().toString())) {

                        bntPrata = Integer.parseInt(txtPrata.getText().toString());

                        valorPrata = 71.74;

                        Ok();




                        //  Toast.makeText(getApplicationContext(), "Prata", Toast.LENGTH_SHORT).show();

                    }else {
                        Toast.makeText(getApplicationContext(), "Digite a Qtd de Vidas", Toast.LENGTH_SHORT).show();
                    }
                }
                //Começo Ouro
                if (ouroCkb.isChecked() == true) {
                    if (!"".equals(txtOuro.getText().toString())) {

                        bntOuro = Integer.parseInt(txtOuro.getText().toString());

                        valorOuro = 83.83;

                        Ok();




                        //   Toast.makeText(getApplicationContext(), " Ouro", Toast.LENGTH_SHORT).show();

                    }else {
                        Toast.makeText(getApplicationContext(), "Digite a Qtd de Vidas", Toast.LENGTH_SHORT).show();
                    }


                } //Fim Ouro







                // Toast.makeText(getApplicationContext(), " valorBronze:" , Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(getApplicationContext(), " Produto não selecionado:", Toast.LENGTH_SHORT).show();
            }








                   /* valorBronze = valorBronze * bntBronzeVidas;
                //Toast.makeText(getApplicationContext(), " valorBronze:" + bntPrata  + " Ouro" + bntOuro , Toast.LENGTH_SHORT).show(); */

        }else {
            Toast.makeText(getApplicationContext(), " Não implementado", Toast.LENGTH_SHORT).show();
        }





    }



    public void Ok() {



        Intent intent = new Intent(getApplicationContext(), FimActivity.class);

        Bundle bundle = new Bundle();

        if (bronzeCkb.isChecked() == true) {

            String txtvalorBronze = "" + valorBronze;
            String txtVidasBronze = "" + bntBronzeVidas;

            bundle.putString("txtvalorBronze", txtvalorBronze);
            bundle.putString("txtVidasBronze", txtVidasBronze);

        }else {

            String txtvalorBronze = "0" ;
            String txtVidasBronze = "0";

            bundle.putString("txtvalorBronze", txtvalorBronze);
            bundle.putString("txtVidasBronze", txtVidasBronze);

        }

        if (prataCkb.isChecked() == true) {

            String txtvalorPrata = "" + valorPrata;
            String txtVidasPrata = "" + bntPrata;

            bundle.putString("txtvalorPrata", txtvalorPrata);
            bundle.putString("txtVidasPrata", txtVidasPrata);

        }else {
            String txtvalorPrata = "0";
            String txtVidasPrata = "0";

            bundle.putString("txtvalorPrata", txtvalorPrata);
            bundle.putString("txtVidasPrata", txtVidasPrata);

        }

        if (ouroCkb.isChecked() == true) {

            String txtvalorOuro = "" + valorOuro;
            String txtVidasOuro = "" + bntOuro;

            bundle.putString("txtvalorOuro", txtvalorOuro);
            bundle.putString("txtVidasOuro", txtVidasOuro);

        }else {

            String txtvalorOuro = "0";
            String txtVidasOuro = "0";

            bundle.putString("txtvalorOuro", txtvalorOuro);
            bundle.putString("txtVidasOuro", txtVidasOuro);

        }


        intent.putExtras(bundle);

        startActivity(intent);


    }

}
