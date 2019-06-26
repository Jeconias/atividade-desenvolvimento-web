package controllers;

import play.mvc.*;
import models.extrato.*;
import models.filme.*;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;


/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index(String genero, String artista) {

        // INSTANCIAR OS AS CLASSES PARA A ATIVIDADE 1

        Extrato ext = new Extrato("Jeconias", "1042-1", "38567-0", new Double("1568.37"));
        Item item_1 = new Item("credito", new Double("10.23"), "02", "Compra com o Cartão - 20:00 Pizza One");
        Item item_2 = new Item("debito", new Double("5.23"), "03", "Compra com o cartão D - 18:52 Pizzaria Paulista");
        Item item_3 = new Item("credito", new Double("18.56"), "05", "Compra com o cartão - 21:41 Drogaria Amadeus");
        Item item_4 = new Item("debito", new Double("32.03"), "05", "Pgto com Débito - BB Consig Em Folha");
        Item item_5 = new Item("credito", new Double("101.087"), "05", "Pgto Boleto Aluguel");
        Item item_6 = new Item("debit", new Double("10.17"), "06", "Pgto com Débito - Boleto MEI - Convênio");

        ext.setItens(item_1);
        ext.setItens(item_2);
        ext.setItens(item_3);
        ext.setItens(item_4);
        ext.setItens(item_5);
        ext.setItens(item_6);

        // INSTANCIAR OS AS CLASSES PARA A ATIVIDADE 2
        Genero g1 = new Genero("comedia", "A comédia é também o género que agrupa todas as obras com essas características. Por mais contraditório que possa parecer, a comédia é um género dramático, tendo em conta que se trata de um género literário ou artístico que apresenta vários episódios da vida através do diálogo dos personagens.");
        Genero g2 = new Genero("terror", "Terror ou horror é um gênero literário, cinematográfico ou musical, que está sempre muito ligado à fantasia e à ficção especulativa, e é criado com intuito de causar medo, aterrorizar.");
        Genero g3 = new Genero("ficcao-cientifica", "Ficção científica é um gênero da ficção especulativa, que normalmente lida com conceitos ficcionais e imaginativos, relacionados ao futuro, ciência e tecnologia, e seus impactos e/ou consequências em uma determinada sociedade ou em seus indivíduos, desenvolvido no século XIX.");

        Filme f1 = new Filme("Toy Story 4", "2019", "EUA", "Woody, Buzz Lightyear e o resto da turma embarcam em uma viagem com Bonnie e um novo brinquedo chamado Forky. A aventura logo se transforma em uma reunião inesperada quando o ligeiro desvio que Woody faz o leva ao seu amigo há muito perdido, Bo Peep.", g1);
        Filme f2 = new Filme("Missão Madrinha de Casamento", "2011", "Brasil", "Lillian vai se casar e convida a amiga Annie para ser sua madrinha. Ela, que enfrenta problemas profissionais e amorosos, resolve se dedicar à função de corpo e alma. Só que, logo no primeiro evento organizado, Annie conhece Helen, uma bela e rica mulher que quer ser a nova melhor amiga de Lillian. As duas passam a disputar a proximidade da noiva, assim como o posto de organizadora do casamento e demais eventos pré-nupciais.", g1);
        Filme f3 = new Filme("Nós", "2019", "EUA", "Adelaide e Gabe levam a família para passar um fim de semana na praia e descansar. Eles começam a aproveitar o ensolarado local, mas a chegada de um grupo misterioso muda tudo e a família se torna refém de seres com aparências iguais às suas.", g2);
        Filme f4 = new Filme("A Chegada", "2016", "EUA", "Naves alienígenas chegaram às principais cidades do mundo. Com a intenção de se comunicar com os visitantes, uma linguista e um militar são chamados para decifrar as estranhas mensagens dos visitantes.", g3);
        Filme f5 = new Filme("Blade Runner - O Caçador de Androides", "1982", "EUA e Hong Kong", "No século 21, uma corporação desenvolve clones humanos para serem usados como escravos em colônias fora da Terra, identificados como replicantes. Em 2019, um ex-policial é acionado para caçar um grupo fugitivo vivendo disfarçado em Los Angeles.", g3);
        
        List<Filme> filmes = new ArrayList<Filme>();
        filmes.add(f1);
        filmes.add(f2);
        filmes.add(f3);
        filmes.add(f4);
        filmes.add(f5);

        // TOY STORY
        Artista a1 = new Artista("Tom Hanks", "9 Jul 1956");
        Artista a2 = new Artista("Tim Allen", "13 Jun 1953");
        // MISSAO MADRINHA
        Artista a3 = new Artista("Kristen Wiig", " 22 Agosto 1973");
        Artista a4 = new Artista("Melissa McCarthy", "26 Ago 1970");
        // BLADE
        Artista a5 = new Artista("Sean Young", "20 Nov 1959");
        Artista a6 = new Artista("Harrison Ford", "13 Jul 1942");
        // A CHEGADA
        Artista a7 = new Artista("Amy Adams", "20 Ago 1974");
        Artista a8 = new Artista("Jeremy Renner", "7 Jan 1971");
        // NOS
        Artista a9 = new Artista("Jordan Peele", "21 Fev 1979");
        Artista a10 = new Artista("Lupita Nyong'o", "1 Mar 1983");

        List<Artista> artistas = new ArrayList<Artista>();
        artistas.add(a1);
        artistas.add(a2);
        artistas.add(a3);
        artistas.add(a4);
        artistas.add(a5);
        artistas.add(a6);
        artistas.add(a7);
        artistas.add(a8);
        artistas.add(a9);
        artistas.add(a10);

        // PAPEIS NO FILME
        Papel p1 = new Papel("Papel 01");
        Papel p2 = new Papel("Papel 02");
        Papel p3 = new Papel("Papel 03");

        f1.setArtista(a1);
        f1.setArtista(a2);

        f2.setArtista(a3);
        f2.setArtista(a4);

        f3.setArtista(a9);
        f3.setArtista(a10);

        f4.setArtista(a7);
        f4.setArtista(a8);

        f5.setArtista(a5);
        f5.setArtista(a6);

        // PAPEIS
        p1.setFilme(f1);
        p1.setFilme(f4);
        p1.setArtista(a1);
        p1.setArtista(a2);
        p1.setArtista(a7);
        p1.setArtista(a8);

        p2.setFilme(f3);
        p3.setFilme(f5);
        p2.setArtista(a9);
        p1.setArtista(a10);
        p2.setArtista(a5);

        p3.setFilme(f5);
        p3.setFilme(f2);
        p1.setArtista(a3);
        p1.setArtista(a4);
        p3.setArtista(a6);

        List<Filme> fShow = new ArrayList<Filme>();
        switch (genero) {
            case "":
                fShow = filmes;
            break;
            case "comedia":
                for(int i = 0; i < filmes.size(); i++){
                    if(filmes.get(i).getGenero().getNome().equals("comedia")) fShow.add(filmes.get(i));
                }
            break;
            case "terror":
                for(int i = 0; i < filmes.size(); i++){
                    if(filmes.get(i).getGenero().getNome().equals("terror")) fShow.add(filmes.get(i));
                }
            break;
            case "ficcao-cientifica":
                for(int i = 0; i < filmes.size(); i++){
                    if(filmes.get(i).getGenero().getNome().equals("ficcao-cientifica")) fShow.add(filmes.get(i));
                }
            break;
            default:
                fShow = filmes;
            break;
        }


        List<Filme> fshowA = new ArrayList<Filme>();
        for(int i = 0; i < filmes.size(); i++)
        {
            for(int j = 0; j < filmes.get(i).getArtistas().size(); j++)
            {
                if(filmes.get(i).getArtistas().get(j).getNome().equals(artista)) fshowA.add(filmes.get(i));
                
            }
        }

        return ok(views.html.index.render(ext, fShow, artistas, fshowA));
    }
}
