package pl.javastart;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
public class ProduktController {

    private ListaProduktow listaProduktow;

    public ProduktController(ListaProduktow listaProduktow) {
        this.listaProduktow = listaProduktow;
    }

    @ResponseBody
    public static String main() {

        return "index.html";

    }

   /*


    @RequestMapping("/list")
    @ResponseBody
    public String wyswietlProdukty(Model model, @RequestParam String kategorie) {

      listaProduktow.ListaProduktow();
      String kat=kategorie;

        if (kat==null || kat.equals("")) { return   wyswietlProdukty(Model model); }
        if (kat.equals("DOMOWE")) { return   wyswietl(Model model, Kategorie.DOMOWE);  }
        if (kat.equals("INNE")) { return   wyswietl(Model model, Kategorie.INNE);  }
        if (kat.equals("SPOZYWCZE")) { return   wyswietl(Model model, Kategorie.SPOZYWCZE);  }
        return "nic";
    }

*/

    @RequestMapping("/list")
    public String wyswietlProdukty(Model model) {
        List<Produkt> produkty=listaProduktow.pobierzProdukty();

        model.addAttribute("produkty", produkty);

         return "produkty";
    }


/*
    public String wyswietl (Model model, Kategorie kategorie){
       List<Produkt> produkty=listaProduktow.pobierzProdukty();

        String result = "";
        int cena=0;

        for (Produkt pr : produkty) {
            if (pr.getKategoria()==kategorie){
            result += pr.toString()+"<br/>";
            cena+=pr.getCena();}
        }
        return "Produkty:<br/>"+result+"<br/><br/>Cena produktów: "+cena;

    } */

}