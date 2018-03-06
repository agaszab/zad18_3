package pl.javastart;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/")
public class ProduktController {

    private ListaProduktow listaProduktow;

    @ResponseBody
    public static String start() {

        return "index.html";

    }

    @RequestMapping("/list")
    @ResponseBody
    public String wyswietlProdukty() {

        // List<Produkt> produkty=listaProduktow.pobierzProdukty();

        String result = "";

        for (Produkt pr : listaProduktow.pobierzProdukty()) {
            result += pr;
        }
        return result;
    }


    @ResponseBody
    @RequestMapping("/list1")
    public String start(HttpServletRequest request) {

        String kat = request.getParameter("kategorie");
        if (kat.equals("")) { return "produkty.html"; }

            return "";
    }
}