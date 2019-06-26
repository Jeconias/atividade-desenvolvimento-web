package models.extrato;

import java.util.List;
import java.util.ArrayList;
import java.text.DecimalFormat;

public class Extrato {

    private String clienteNome;
    private String ag;
    private String numeroConta;
    private Double saldoAnterior;
    private Double saldoAtual;
    private List<Item> itens;

    public Extrato (){}

    public Extrato(String clienteNome, String ag, String numeroConta, Double saldoAtual) {
        this.clienteNome    = clienteNome;
        this.ag             = ag;
        this.numeroConta    = numeroConta;
        this.saldoAtual     = this.saldoAnterior = saldoAtual;
        this.itens          = new ArrayList<Item>();
    }

    public String getClienteNome() {
        return this.clienteNome;
    }

    public void setClienteNome(String clienteNome) {
        this.clienteNome = clienteNome;
    }

    public String getAg() {
        return this.ag;
    }

    public void setAg(String ag) {
        this.ag = ag;
    }

    public String getNumeroConta() {
        return this.numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Double getSaldoAnterior() {
        return this.saldoAnterior;
    }

    public String getSaldoAnteriorFormatoBr() {
        DecimalFormat df = new DecimalFormat("###,###.00");
        return df.format(this.saldoAnterior);
    }

    public void setSaldoAnterior(Double saldoAnterior) {
        this.saldoAnterior = saldoAnterior;
    }

    public Double getSaldoAtual() {
        return this.saldoAtual;
    }

    public String getSaldoAtualFormatoBr() {
        DecimalFormat df = new DecimalFormat("###,###.00");
        return df.format(this.saldoAtual);
    }

    public void setSaldoAtual(Double saldoAtual) {
        this.saldoAtual = saldoAtual;
    }

    public List<Item> getItens() {
        return this.itens;
    }

    public void setItens(Item item) {
        this.saldoAtual -= item.getValor();
        this.itens.add(item);
    }
}