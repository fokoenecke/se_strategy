package shop;

/**
 * Created by ole on 04.12.14.
 */
public class NeukundeAngebot implements AngebotStrategie{
    @Override
    public void anbieten() {
        System.out.println("Top-Angebote für alle Neukunden...");
    }
}
