package Act11_Prototype;

import java.awt.*;

/**
 * Created by Budha on 10/10/16.
 */

public class Quadrat extends Figura {

    private int side;

    public Quadrat(int side) {
        this.side = side;
    }

    public void draw(Graphics g) {
        super.draw(g);
        g.drawLine(10,10,side,side);
    }
}
