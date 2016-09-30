package Act4_Herencia;

/**
 * Created by Budha on 29/9/16.
 */

public class Intercanvi extends Alumnat{
    private int nie;
    private String paisOrigen;

    public Intercanvi(String nom, String adresa, int edat, String dataAlta, int nie, String paisOrigen) {
        super(nom, adresa, edat, dataAlta);
        this.nie = nie;
        this.paisOrigen = paisOrigen;
    }
}
