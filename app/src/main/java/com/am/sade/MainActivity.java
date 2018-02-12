package com.am.sade;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Spinner;
import android.widget.Toast;

import java.security.SecurityPermission;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener, AdapterView.OnItemSelectedListener{

    private Spinner uf;
    private Spinner cid;
    private Spinner pme;
    private Spinner plano;
    private Spinner temPlano;
    private CheckBox bronze;
    private CheckBox prata;
    private CheckBox ouro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        uf = (Spinner) findViewById(R.id.spinUf);
        ArrayAdapter adapterUF = ArrayAdapter.createFromResource(this,R.array.Uf,android.R.layout.simple_spinner_item);
        uf.setAdapter(adapterUF);

        cid = (Spinner) findViewById(R.id.spinCidade);
        ArrayAdapter adapterCid = ArrayAdapter.createFromResource(this,R.array.Cidade,android.R.layout.simple_spinner_item);
        cid.setAdapter(adapterCid);

        pme = (Spinner) findViewById(R.id.spinPme);
        ArrayAdapter adapterPme = ArrayAdapter.createFromResource(this,R.array.PME,android.R.layout.simple_spinner_item);
        pme.setAdapter(adapterPme);

        plano = (Spinner) findViewById(R.id.spinPlano);
        ArrayAdapter adapterPlano = ArrayAdapter.createFromResource(this,R.array.Plano,android.R.layout.simple_spinner_item);
        plano.setAdapter(adapterPlano);

        temPlano = (Spinner) findViewById(R.id.spinTemPlano);
        ArrayAdapter adapterTemPlano = ArrayAdapter.createFromResource(this,R.array.TemPlano,android.R.layout.simple_spinner_item);
        temPlano.setAdapter(adapterTemPlano);

        bronze = (CheckBox)findViewById(R.id.checkBoxBronze);
        prata = (CheckBox)findViewById(R.id.checkBoxPrata);
        ouro = (CheckBox)findViewById(R.id.checkBoxOuro);

        bronze.setOnCheckedChangeListener(this);
        prata.setOnCheckedChangeListener(this);

        bronze.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    Toast.makeText(getApplicationContext(),"Ok",Toast.LENGTH_LONG).show();
                }

            }
        });

    }


    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        switch (buttonView.getId()){
            case R.id.checkBoxBronze:
                Toast.makeText(getApplicationContext(),"ok",Toast.LENGTH_SHORT).show();
                break;
            case R.id.checkBoxPrata:

                break;
            case R.id.checkBoxOuro:
                break;
        }
    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        switch (position){
            case 0:
                /*Faz alguma coisa*/
                break;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
