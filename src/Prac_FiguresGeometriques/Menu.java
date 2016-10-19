package Prac_FiguresGeometriques;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

/**
 * Created by Budha on 08/10/16.
 */

public class Menu {

    Figura figura;
    //boolean fill;
    //Color color;

    public Menu(){
        seeMenu();
    }

    /**
     * Opcions del menu de figures a dibuixar
     */
    public void optionMenu(){
        printMissage("A. Cadena de text");
        printMissage("B. Punt");
        printMissage("C. Linia");
        printMissage("D. Cercle");
        printMissage("E. Quadrat");
        printMissage("F. Rectangle");
        printMissage("G. Poligon");
        printMissage("H. Historial de figures");
        printMissage("I. Sortir");
    }

    /**
     * Metode per tractar les opcions del menu de les figures
     */

    public Figura seeMenu(){
        String optionFigure;
        printMissage("Tria una de les opcions de les figures:");
        optionMenu();
        optionFigure = readString();
        switch (optionFigure){
            case "A": //Cadena de tect
                String chain = JOptionPane.showInputDialog("Dels colors mostrats per consola, quin vols? ");
                return new Cadena (chain);
            case "B": //Punt
                int xp1 = Integer.parseInt(JOptionPane.showInputDialog("Coordenada x1: "));
                int yp1 = Integer.parseInt(JOptionPane.showInputDialog("Coordenada y1: "));
                return new Punt(xp1,yp1);
            case "C": //Linia
                int xl1 = Integer.parseInt(JOptionPane.showInputDialog("Coordenada x1: "));
                int yl1 = Integer.parseInt(JOptionPane.showInputDialog("Coordenada y1: "));
                int xl2 = Integer.parseInt(JOptionPane.showInputDialog("Coordenada x2: "));
                int yl2 = Integer.parseInt(JOptionPane.showInputDialog("Coordenada y2: "));
                //String color = JOptionPane.showInputDialog("Dels colors mostrats per consola, quin vols? ");
                //showColors();
                //boolean fill = Boolean.parseBoolean(JOptionPane.showInputDialog("Vols unplir la figura? "));
                return new Linia(xl1, yl1, xl2, yl2);
            case "D": //Cercle
                int radi = Integer.parseInt(JOptionPane.showInputDialog("Introdueix el radi: "));
                return new Cercle(radi);
            case "E": //Quadrat
                int side = Integer.parseInt(JOptionPane.showInputDialog("Costat: "));
                return new Quadrat(side);
            case "F": //Rectangle
                int hight = Integer.parseInt(JOptionPane.showInputDialog("Altura: "));
                int width = Integer.parseInt(JOptionPane.showInputDialog("Amplari: "));
                return new Rectangle(hight,width);
            case "G": //Poligon
                printMissage("Fora de servei");
            case "H": //Historial de figures
                printMissage("Fora de servei");
            case "I": System.exit(0);
                default: printMissage("Cap de les opcions es correcte, tria una de les existents");
        }
        return figura;
    }

    public void showColors(){
        printMissage("A: black");
        printMissage("B: blue");
        printMissage("C: green");
        printMissage("D: pink");
        printMissage("E: yellow");
    }





    /**
     * imprimir String
     * @param sms
     */
    public void printMissage(String sms){
        System.out.println(sms);
    }

    /**
     * lletgir Int
     * @return
     */
    public int readInt(){
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    /**
     * lletgir String
     * @return
     */
    public String readString(){
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }


}
