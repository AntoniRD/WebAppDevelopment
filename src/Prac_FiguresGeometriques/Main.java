package Prac_FiguresGeometriques;

import java.util.ArrayList;
import javax.swing.*;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by Budha on 08/10/16.
 */

public class Main{
    static ArrayList <Figura> listFigure;
    public static void main(String[] args) {
        final Lienzo lienzo = new Lienzo();

        //Elección de figura.
        //String nombreFigura;

        //Arranque de Frame en un hilo nuevo.
        Runnable guiThread = (new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame("Lienzo");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                frame.setBounds(100, 100, 800, 600);
                frame.getContentPane().add(lienzo);

                frame.setVisible(true);
            }
        });


        try {
            SwingUtilities.invokeAndWait(guiThread);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }


        Menu menu = new Menu();


        if (listFigure != null) {
            listFigure = new ArrayList<>();
        }


        Figura figura = menu.seeMenu();


        /*
        listFigure.add(figura);
        listFigure.set(figura);
        */
        lienzo.setFigura(figura);
        lienzo.repaint();



    }

}
