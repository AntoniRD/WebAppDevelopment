package Prac_FiguresGeometriques;

import java.awt.*;

/**
 * Created by Budha on 10/10/16.
 */

public class Punt extends Figura{
    private int xp1,yp1;

    public Punt(int xp1, int yp1) {
        this.xp1 = xp1;
        this.yp1 = yp1;
    }

    public void drawFigure(Graphics g) {
        super.draw(g);
        g.drawLine(xp1, yp1, xp1, yp1);
    }

}
