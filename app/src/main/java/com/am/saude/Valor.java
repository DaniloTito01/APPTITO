package com.am.saude;


public class Valor {

    String Uf,Cid,Pme,tipoContratacao,temPlano;
    Double bronze,prata,ouro,valor;


    public Valor(String uf, String cid, String pme,
                 String tipoContratacao, String temPlano) {
        Uf = uf;
        Cid = cid;
        Pme = pme;
        this.tipoContratacao = tipoContratacao;
        this.temPlano = temPlano;
       // this.bronze = bronze;
      //  this.prata = prata;
       // this.ouro = ouro;

    }

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

    public Double getBronze() {
        return bronze;
    }

    public void setBronze(Double bronze) {
        this.bronze = bronze;
    }

    public Double getPrata() {
        return prata;
    }

    public void setPrata(Double prata) {
        this.prata = prata;
    }

    public Double getOuro() {
        return ouro;
    }

    public void setOuro(Double ouro) {
        this.ouro = ouro;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
