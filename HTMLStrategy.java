package shop;

/**
 * Created by ole on 04.12.14.
 */
public class HTMLStrategy implements PrintStrategy {
    @Override
    public void drucken(Rechnung rechnung) {
        System.out.println("<table>");
        for (Artikel artikel : rechnung.getArtikelList()) {
            System.out.println("\t<tr>");
            System.out.printf("\t\t<td>%s</td>\n", artikel.getName());
            System.out.printf("\t\t<td>%f</td>\n", artikel.getPrice());
            System.out.println("\t</tr>");
        }
        System.out.println("</table>");
    }
}
