package models.filme;

import java.util.List;
import java.util.ArrayList;

public class Papel {

    private String papel;
    private List<Filme> filmes;
    private List<Artista> artistas;

    public Papel(String papel)
    {
        this.papel      = papel;
        this.filmes     = new ArrayList<Filme>();
        this.artistas   = new ArrayList<Artista>();
    }

    public String getPapel() {
        return this.papel;
    }

    public void setPapel(String papel) {
        this.papel = papel;
    }

    public List<Filme> getFilmes() {
        return this.filmes;
    }

    public void setFilme(Filme filme) {
        this.filmes.add(filme);
    }

    public List<Artista> getArtistas() {
        return this.artistas;
    }

    public void setArtista(Artista artista) {
        this.artistas.add(artista);
    }
}