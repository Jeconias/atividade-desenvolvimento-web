package models.filme;

import java.util.List;
import java.util.ArrayList;

public class Artista {

    private String nome;
    private String nascimento;
    private List<Filme> filmes;

    public Artista (String nome, String nascimento)
    {
        this.nome       = nome;
        this.nascimento = nascimento;
        this.filmes     = new ArrayList<Filme>();
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNascimento() {
        return this.nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public List<Filme> getFilmes() {
        return this.filmes;
    }

    public Artista setFilme(Filme filme) {
        this.filmes.add(filme);
        return this;
    }
}