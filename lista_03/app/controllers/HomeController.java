package controllers;

import play.mvc.*;

import java.util.Map;
import java.util.List;
import java.util.ArrayList;


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
        return ok(views.html.index.render("#", true));
    }

    public Result yuml() {

        Map<String, String []> r = request().body().asFormUrlEncoded();

        String autor = String.valueOf(r.get("autor")[0]);
        String casosDeUso = String.valueOf(r.get("casosDeUso")[0]);
        boolean cor = Boolean.parseBoolean(r.get("cor")[0]);
        String formatStyle = String.valueOf(r.get("format")[0]);
        String extensaoSelect = String.valueOf(r.get("extensao")[0]);

        String url = "https://yuml.me/diagram/" + formatStyle + "/usecase/";
        String [] cdus = casosDeUso.split("\n");

        url += gerarAutorECdu(autor, cdus, cor);
        url += extensaoSelect;
        
        if(extensaoSelect.equals(".pdf")) return redirect(url);
        return ok(views.html.index.render(url, false));
    }

    private String gerarAutorECdu(String autor, String[] cdus, boolean cor)
    {
        String cdu;
        String result = "";
        int cdusSize = cdus.length;

        for(int i = 0; i < cdusSize; i++)
        {
            cdu = "[@autor]-(\"@cdu\"{bg:@color})";
            cdu = cdu.replace("@autor", autor);
            cdu = cdu.replace("@cdu", cdus[i]);
            if(cor) cdu = cdu.replace("@color", HomeController.cores[(int) (1 + Math.random() * 10) -1]);
            result += cdu + ",";
        }
        return result.substring(0, (result.length() - 1)).replace("\r", "");
    }

    private static String [] cores = {"orange", "red", "white", "blue", "pink", "green", "purple", "gray", "yellow", "brown"};

}
