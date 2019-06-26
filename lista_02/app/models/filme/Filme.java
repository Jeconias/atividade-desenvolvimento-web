package models.filme;

import java.util.List;
import java.util.ArrayList;

public class Filme {

    private String nome;
    private String ano;
    private String pais;
    private String sinopse;
    private Genero genero;
    private List<Artista> artistas;

    public Filme(String nome, String ano, String pais, String sinopse, Genero genero)
    {
        this.nome       = nome;
        this.ano        = ano;
        this.pais       = pais;
        this.sinopse    = sinopse;
        this.genero     = genero.setFilme(this);
        this.artistas   = new ArrayList<Artista>();
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAno() {
        return this.ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getPais() {
        return this.pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getSinopse() {
        return this.sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public Genero getGenero() {
        return this.genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public List<Artista> getArtistas() {
        return this.artistas;
    }
    
    public String getArtistasStr(){
        String nomes = "";
        for(int i = 0; i < this.artistas.size(); i++){
            nomes += this.artistas.get(i).getNome() + ", ";
        }
        return nomes.substring(0, nomes.length() - 2);
    }

    public void setArtista(Artista artista) {
        this.artistas.add(artista.setFilme(this));
    }

    

}