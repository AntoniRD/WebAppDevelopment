package Act11_Prototype;

import java.awt.*;

/**
 * Created by Budha on 10/10/16.
 */
public class Cadena extends Figura {

    private String chain;

    public Cadena(String chain) {
        this.chain = chain;
    }

    public void draw(Graphics g) {
        super.draw(g);
        g.drawString(chain, 20, 20);
        g.setFont(new Font("Arial", Font.BOLD ,100));
    }

}
