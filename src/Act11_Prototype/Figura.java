package Act11_Prototype;

import java.awt.*;

/**
 * Created by Budha on 08/10/16.
 */
public class Figura implements Cloneable { //implementa l'interfaç clonable


    public void draw(Graphics g) {}

    //Metode importat de l'interfaç clonable
    @Override
    protected Figura clone() throws CloneNotSupportedException {
        return (Figura) super.clone();
    }
}
