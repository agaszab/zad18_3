package pl.javastart;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
@RequestMapping("/")
public class ProduktController {

    private ListaProduktow listaProduktow = new ListaProduktow();


    @ResponseBody
    public static String main() {
        return "index.html";

    }


    @RequestMapping("/list")
    @ResponseBody
    public String wyswietlProdukty(@RequestParam Kategorie kategoria) {

      listaProduktow.ListaProduktow();
      Kategorie kat=kategoria;

        if (kat==null || kat.equals("")) { return   wyswietlProdukty(); }
        if (kat.equals("DOMOWE")) { return   wyswietl(Kategorie.DOMOWE);  }
        if (kat.equals("INNE")) { return   wyswietl(Kategorie.INNE);  }
        if (kat.equals("SPOZYWCZE")) { return   wyswietl(Kategorie.SPOZYWCZE);  }
        return "nic";
    }


    @ResponseBody
    public String wyswietlProdukty() {

        List<Produkt> produkty=listaProduktow.pobierzProdukty();

        String result = "";
        int cena=0;

        for (Produkt pr : produkty) {
            result += pr.toString()+"<br/>";
            cena+=pr.getCena();
        }
       return "Produkty:<br/>"+result+"<br/><br/>Cena produktów: "+cena;

    }

    public String wyswietl (Kategorie kategorie){
        List<Produkt> produkty=listaProduktow.pobierzProdukty();

        String result = "";
        int cena=0;

        for (Produkt pr : produkty) {
            if (pr.getKategoria()==kategorie){
            result += pr.toString()+"<br/>";
            cena+=pr.getCena();}
        }
        return "Produkty:<br/>"+result+"<br/><br/>Cena produktów: "+cena;

    }

}