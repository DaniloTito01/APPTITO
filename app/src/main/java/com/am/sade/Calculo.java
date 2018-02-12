package com.am.sade;

/**
 * Created by Startup on 12/02/2018.
 */

public class Calculo {


    String  Uf,Cid,Pme,tipoContratacao,temPlano,bronze,prata,ouro,valor;


    public String getUf() {
        return Uf;
    }

    public void setUf(String uf) {
        Uf = uf;
    }

    public String getCid() {
        return Cid;
    }

    public void setCid(String cid) {
        Cid = cid;
    }

    public String getPme() {
        return Pme;
    }

    public void setPme(String pme) {
        Pme = pme;
    }

    public String getTipoContratacao() {
        return tipoContratacao;
    }

    public void setTipoContratacao(String tipoContratacao) {
        this.tipoContratacao = tipoContratacao;
    }

    public String getTemPlano() {
        return temPlano;
    }

    public void setTemPlano(String temPlano) {
        this.temPlano = temPlano;
    }

    public String getBronze() {
        return bronze;
    }

    public void setBronze(String bronze) {
        this.bronze = bronze;
    }

    public String getPrata() {
        return prata;
    }

    public void setPrata(String prata) {
        this.prata = prata;
    }

    public String getOuro() {
        return ouro;
    }

    public void setOuro(String ouro) {
        this.ouro = ouro;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Calculo(String uf, String cid, String pme, String tipoContratacao, String temPlano) {
        Uf = uf;
        Cid = cid;
        Pme = pme;
        this.tipoContratacao = tipoContratacao;
        this.temPlano = temPlano;
       // this.bronze = bronze;
        //this.prata = prata;
       // this.ouro = ouro;
    }
}
