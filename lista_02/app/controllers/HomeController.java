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

        //Extrato ext = new Extrato("Jeconias", "1042-1", "38567-0", 741.20, 245.10);
        //Item item_1 = new Item("credito", new Double("10.23"), "02");
        //Item item_2 = new Item("debito", new Double("5.23"), "03");
        //Item item_3 = new Item("debito", new Double("17.04"), "04");

        //ext.setItens(item_1);
        //ext.setItens(item_2);
        //dext.setItens(item_3);

        return ok(views.html.index.render());
    }

}
