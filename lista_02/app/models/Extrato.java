package models;

import java.util.List;
import java.util.ArrayList;

public class Extrato {

    private String clienteNome;
    private String ag;
    private String numeroConta;
    private Double saldoAnterior;
    private Double saldoAtual;
    private List<Item> itens;

    public void Extrato (){}

    public void Extrato(String clienteNome, String ag, String numeroConta, Double saldoAnterior, Double saldoAtual) {
        this.clienteNome    = clienteNome;
        this.ag             = ag;
        this.numeroConta    = numeroConta;
        this.saldoAnterior  = saldoAnterior;
        this.saldoAtual     = saldoAtual;
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

    public void setSaldoAnterior(Double saldoAnterior) {
        this.saldoAnterior = saldoAnterior;
    }

    public Double getSaldoAtual() {
        return this.saldoAtual;
    }

    public void setSaldoAtual(Double saldoAtual) {
        this.saldoAtual = saldoAtual;
    }

    public List<Item> getItens() {
        return this.itens;
    }

    public void setItens(Item item) {
        this.itens.add(item);
    }
}