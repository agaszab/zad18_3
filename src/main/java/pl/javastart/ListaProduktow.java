package pl.javastart;

import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;


@Repository
public class ListaProduktow {


    private List <Produkt> produkty;

    public ListaProduktow () {


        produkty = new ArrayList<>();

        Produkt pr1=new Produkt("masło", Kategorie.SPOZYWCZE, 34);
        Produkt pr2=new Produkt("chleb", Kategorie.SPOZYWCZE, 6);
        Produkt pr3=new Produkt("książka", Kategorie.INNE, 11);
        Produkt pr4=new Produkt("długopis", Kategorie.INNE, 4);
        Produkt pr5=new Produkt("sok", Kategorie.SPOZYWCZE, 5);
        Produkt pr6=new Produkt("proszek do prania", Kategorie.DOMOWE, 14);
        Produkt pr7=new Produkt("lampka", Kategorie.DOMOWE, 42);
        Produkt pr8=new Produkt("talerze", Kategorie.DOMOWE, 61);
        Produkt pr9=new Produkt("biały ser", Kategorie.SPOZYWCZE, 15);

        produkty.add(pr1);
        produkty.add(pr2);
        produkty.add(pr3);
        produkty.add(pr4);
        produkty.add(pr5);
        produkty.add(pr6);
        produkty.add(pr7);
        produkty.add(pr8);
        produkty.add(pr9);
    }

    public List<Produkt> pobierzProdukty() {
        return produkty;
    }

    public void add (Produkt produkt) {

        produkty.add(produkt);

    }


}