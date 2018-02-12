package com.am.sade;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;


import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    Spinner uf;
    Spinner cid;
    Spinner pme;
    Spinner plano;
    Spinner temPlano;
    //Text txtBronze;
   // Text txtPrata;
  //  Text txtOuro;
    private Button btnCalculo;

    int ufe;



    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     //   txtBronze = (Text) findViewById(R.id.editText);
      //  txtPrata = (Text) findViewById(R.id.editText2);
       // txtOuro = (Text) findViewById(R.id.editText3);


        btnCalculo = (Button) findViewById(R.id.bntCalcular);
        btnCalculo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


               // Toast.makeText(getApplicationContext(),"Uf :" + Calculo();, Toast.LENGTH_SHORT).show();
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

  public void Calculo (){

        String bntUf = uf.getSelectedItem().toString();
        String bntCid = cid.getSelectedItem().toString();
        String bntPme = pme.getSelectedItem().toString();
        String bntTipoPlano = plano.getSelectedItem().toString();
        String bntTemPlano = temPlano.getSelectedItem().toString();
     //   String bntBronze = temPlano.getSelectedItem().toString();
       // String bntPrata = temPlano.getSelectedItem().toString();
      //  String bntOuro = temPlano.getSelectedItem().toString();


  Calculo  cal = new Calculo(bntUf,bntCid,bntPme,bntTipoPlano,bntTemPlano);



    }

}
