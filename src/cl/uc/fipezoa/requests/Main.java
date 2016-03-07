package cl.uc.fipezoa.requests;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by fipezoa on 1/29/2016.
 */
public class Main {

    public static void main(String[] args){
        Session session = new Session();
        try {
            UrlParameters parameters = new UrlParameters();
            parameters.addParameter("login", "usuario");
            parameters.addParameter("passwd", "password");
            parameters.addParameter("sw", "");
            parameters.addParameter("sh", "");
            parameters.addParameter("cd", "");
            System.out.println(session.post("https://intrawww.ing.puc.cl/siding/index.phtml", parameters).getContent().toString());
            System.out.println(session.get("https://intrawww.ing.puc.cl/siding/index.phtml").getContent().toString());
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
