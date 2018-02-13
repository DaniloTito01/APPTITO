package com.am.saude;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.am.sade.R;

import java.util.Objects;


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

    int ufe;



    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      txtBronze = (EditText) findViewById(R.id.editText);
       txtPrata = (EditText) findViewById(R.id.editText2);
       txtOuro = (EditText) findViewById(R.id.editText3);


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
                ufe = i;

                      switch (ufe){
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

  public void Calculo () {

      int bntUf = uf.getSelectedItemPosition();
      int bntCid = cid.getSelectedItemPosition();
      int bntPme = pme.getSelectedItemPosition();
      int bntTipoPlano = plano.getSelectedItemPosition();;
      int bntTemPlano = temPlano.getSelectedItemPosition();
      int bntBronze = Integer.parseInt(txtBronze.getText().toString());
       int bntPrata =Integer.parseInt(txtPrata.getText().toString());
      int bntOuro = Integer.parseInt(txtOuro.getText().toString());


   if (bntUf == 0 && bntCid ==0 && bntPme==0 &&bntTipoPlano==0 && bntTemPlano==0){

          double valorBronze = 14.60;

          valorBronze = valorBronze * bntBronze;

    Toast.makeText(getApplicationContext(), " valorBronze:" + valorBronze  , Toast.LENGTH_SHORT).show();

      }else


          Toast.makeText(getApplicationContext(), " Nao:", Toast.LENGTH_SHORT).show();
      }

  }

