package Act11_Prototype;

import java.awt.*;

/**
 * Created by Budha on 08/10/16.
 */
public class Linia extends Figura {

    //private Color color;
    private int xl1, yl1, xl2, yl2;
    //private boolean fill;


    public Linia(int xl1, int yl1, int xl2, int yl2) {
        this.xl1 = xl1;
        this.yl1 = yl1;
        this.xl2 = xl2;
        this.yl2 = yl2;
    }

    public void draw(Graphics g) {
        super.draw(g);
        g.drawLine(xl1, yl1, xl2, yl2);
    }

}
