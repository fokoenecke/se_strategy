package shop;

/**
 * Created by ole on 04.12.14.
 */
public class Kunde {
    private AngebotStrategie angebotStrategie;
    private Rechnung rechnung = new Rechnung();

    public Kunde(AngebotStrategie strategie) {
        this.setAngebotStrategie(strategie);
    }

    public void addArtikel(Artikel artikel) {
        this.rechnung.add(artikel);
    }

    public void printRechnung() {
        this.rechnung.drucken();
    }

    public void setPrintStrategy(PrintStrategy strategy) {
        this.rechnung.setPrintStrategy(strategy);
    }

    public void setAngebotStrategie(AngebotStrategie strategie){
        this.angebotStrategie = strategie;
    }

    public void anbieten(){
        this.angebotStrategie.anbieten();
    }

    public static void main(String[] args) {
        Artikel ps4 = new Artikel("PS4", 399.99f);
        Artikel xbox = new Artikel("XBOX One", 299.99f);

        Kunde neukunde = new Kunde(new NeukundeAngebot());
        Kunde stammkunde = new Kunde(new StammkundeAngebot());

        neukunde.addArtikel(ps4);
        neukunde.addArtikel(xbox);

        neukunde.printRechnung();
        neukunde.setPrintStrategy(new HTMLStrategy());
        neukunde.printRechnung();

        neukunde.anbieten();
        stammkunde.anbieten();
    }
}
