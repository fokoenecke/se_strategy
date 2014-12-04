package shop;

/**
 * Created by ole on 04.12.14.
 */
public class TextStrategy implements PrintStrategy {
    @Override
    public void drucken(Rechnung rechnung) {
        for (Artikel artikel : rechnung.getArtikelList()) {
            System.out.format("%s %10.2f\n", artikel.getName(), artikel.getPrice());
        }
    }
}
