package shop;

import java.util.ArrayList;
import java.util.List;

public class Rechnung {
    private List<Artikel> artikelList = new ArrayList();
    private PrintStrategy printStrategy = new TextStrategy();

    public void add(Artikel artikel) {
        this.artikelList.add(artikel);
    }

    public List<Artikel> getArtikelList() {
        return this.artikelList;
    }

    public void setPrintStrategy(PrintStrategy strategy) {
        this.printStrategy = strategy;
    }

    public void drucken() {
        this.printStrategy.drucken(this);
    }
}
