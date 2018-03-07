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
    public String wyswietlProdukty(HttpServletRequest request) {

      String kat = request.getParameter("kategorie");

        if (kat==null || kat.equals("")) { return   wyswietlProdukty(); }
        if (kat.equals("DOMOWE")) { return   wyswietl(Kategorie.DOMOWE);  }
        if (kat.equals("INNE")) { return   wyswietl(Kategorie.INNE);  }
        if (kat.equals("SPOZYWCZE")) { return   wyswietl(Kategorie.SPOZYWCZE);  }
        return "nic";
    }


  //  @RequestMapping("/list")
    @ResponseBody
    public String wyswietlProdukty() {

        List<Produkt> produkty=listaProduktow.pobierzProdukty();

        String result = "";

        for (Produkt pr : produkty) {
            result += pr.toString();
        }
       return result;

    }

    public String wyswietl (Kategorie kategorie){
        List<Produkt> produkty=listaProduktow.pobierzProdukty();

        String result = "";

        for (Produkt pr : produkty) {
            if (pr.getKategoria()==kategorie)
            result += pr.toString();
        }
        return result;

    }




}