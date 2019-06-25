package controllers;

import play.mvc.*;
import models.*;

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
    public Result index() {

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


        return ok(views.html.index.render(ext));
    }

}
