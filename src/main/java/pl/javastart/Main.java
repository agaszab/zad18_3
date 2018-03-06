package pl.javastart;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.javastart.AppConfig;
import pl.javastart.ListaProduktow;
import pl.javastart.Produkt;
import pl.javastart.ProduktController;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ListaProduktow listaProduktow = context.getBean(ListaProduktow.class);
        Produkt produkt = context.getBean(Produkt.class);
     //   ProduktController.start();
    }
}