package pl.javastart;


import org.springframework.stereotype.Component;

@Component
public class Produkt {
    private String nazwa;
    private Kategorie kategoria;
    private int cena;

    public  Produkt(String nazwa, Kategorie kategoria, int cena) {
        this.nazwa = nazwa;
        this.kategoria = kategoria;
        this.cena = cena;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public Kategorie getKategoria() {
        return kategoria;
    }

    public void setKategoria(Kategorie kategoria) {
        this.kategoria = kategoria;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    @Override
    public String toString() {
        return "Nazwa produktu: " + nazwa + ", kategoria: " + kategoria + ", cena: " + cena+"\n";
    }
}
