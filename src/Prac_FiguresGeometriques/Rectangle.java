package Prac_FiguresGeometriques;

import java.awt.*;

/**
 * Created by Budha on 10/10/16.
 */

public class Rectangle extends Figura{

    private int height, wifth;

    public Rectangle(int height, int wifth) {
        this.height = height;
        this.wifth = wifth;
    }

    public void draw(Graphics g) {
        super.draw(g);
        g.drawLine(10,10,height,wifth);
    }
}
