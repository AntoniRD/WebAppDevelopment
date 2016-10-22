package Act11_Prototype;

import javax.swing.*;
import java.awt.*;


/**
 * Created by Budha on 08/10/16.
 */

public class Lienzo extends JPanel{

    private Figura figura;

    public void paint(Graphics g){
        super.paint(g);
        figura.draw(g);
    }

    public Figura getFigura(){
        return figura;
    }

    public void setFigura(Figura figura){
        this.figura = figura;
    }

}
