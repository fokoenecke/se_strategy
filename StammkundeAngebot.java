package shop;

/**
 * Created by ole on 04.12.14.
 */
public class StammkundeAngebot implements AngebotStrategie {
    @Override
    public void anbieten() {
        System.out.println("Sie haben bei ihrem letzten Besuch...");
    }
}
