package models;

import java.text.DecimalFormat;

public class Item {

    public static final String TIPO_CREDITO = "credito"; 
    public static final String TIPO_DEBITO = "debito";

    private String tipo;
    private Double valor;
    private String data;
    private String historico;

    public Item(String tipo, Double valor, String data, String historico) {
        this.setTipo(tipo);
        this.valor      = valor;
        this.data       = data;
        this.historico  = historico;
    }

    public String getData() {
        return this.data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHistorico() {
        return this.historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }

    public Double getValor() {
        return this.valor;
    }

    public String getValorFormatBr() {
        DecimalFormat df = new DecimalFormat("###,###.00");
        return df.format(this.valor);
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = (tipo.equals("credito")) ? Item.TIPO_CREDITO : Item.TIPO_DEBITO;
    }
}