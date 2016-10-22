package Act11_Prototype;

import java.awt.*;

/**
 * Created by Budha on 10/10/16.
 */

public class Cercle extends Figura {
    private int radi;

    public Cercle(int radi) {
        this.radi = radi;
    }

    public void draw(Graphics g) {
        super.draw(g);
        g.drawOval(10,10,radi,radi);
    }
}
