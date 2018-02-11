package com.am.sade;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.security.SecurityPermission;

public class MainActivity extends AppCompatActivity {

    Spinner uf;
    Spinner cid;
    Spinner pme;
    Spinner plano;
    Spinner temPlano;

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

    }

    AdapterView.OnItemSelectedListener cidade = new AdapterView.OnItemSelectedListener() {
        @Override
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {



        }

        @Override
        public void onNothingSelected(AdapterView<?> adapterView) {

        }
    };
}
