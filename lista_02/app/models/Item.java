package models;

public class Item {

    public static final String TIPO_CREDITO = "credito"; 
    public static final String TIPO_DEBITO = "debito";

    private String data;
    private String historico;
    private Double valor;
    private String tipo;

    public void Item(String tipo, Double valor, String data) {
        this.tipo   = tipo;
        this.valor  = valor;
        this.data   = data;
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