package Prac_DibuixarFigGeometriques;

import java.util.Scanner;

/**
 * Created by Budha on 6/10/16.
 */

public class Menu {

    public Menu() {
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
    String optionFigure;
    public String seeMenu(){
        printMissage("Tria una de les opcions de les figures:");
        optionMenu();
        optionFigure = readString();
        switch (optionFigure){
            case "A": return "cadenaText";
            case "B": return "punt";
            case "C": return "linia";
            case "D": return "cercle";
            case "E": return "quadrat";
            case "F": return "rectangle";
            case "G": return "poligon";
            case "H": return "historialFigures";
            case "I": default: printMissage("Cap de les opcions es correcte, tria una de les existents");
        }
        return optionFigure;
    }

    /**
     * Opcions del color de les figures
     */
    public void menuColorFigure(){
        printMissage("A: Negre");
        printMissage("B: Blau");
        printMissage("C: Verd");
        printMissage("D: Rosa");
    }

    /**
     * Metode per tractar de quin color es pintara la figura
     * retorna el color de les linies
     * @return optionColor
     */
    String optionColor;
    public String seeColorFigure(){
        printMissage("Tria una de les opcions del color de la figura:");
        menuColorFigure();
        optionColor = readString();
        switch (optionColor){
            case "A": return "negre";
            case "B": return "blau";
            case "C": return "verd";
            case "D": return "rosa";
            default: printMissage("Cap de les opcions es correcte, tria una de les existents");
        }
        return optionColor;
    }

    /**
     * Opcions de si vol unplir la figura del color triat de la figura
     */
    public void menuFillFigure(){
        printMissage("A: Si");
        printMissage("B: No");
    }

    /**
     * @return optionFill
     */
    String optionFill;
    public String seeFillFigure(){
        printMissage("Vols umplir la figura amb el color seleccionat?");
        menuFillFigure();
        optionFill = readString();
        switch (optionFill){
            case "A": return "si";
            case "B": return "no";
            default: printMissage("Cap de les opcions es correcte, tria una de les existents");
        }
        return optionFill;
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

