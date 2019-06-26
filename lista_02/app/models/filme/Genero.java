package models.filme;

import java.util.List;
import java.util.ArrayList;

public class Genero {

    private String nome;
    private String descricao;
    private List<Filme> filmes;

    public Genero(String nome, String descricao) {
        this.nome       = nome;
        this.descricao  = descricao;
        this.filmes     = new ArrayList<Filme>();
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Filme> getFilmes() {
        return this.filmes;
    }

    public Genero setFilme(Filme filme) {
        this.filmes.add(filme);
        return this;
    }
}