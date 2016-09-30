package Act4_Herencia;

/**
 * Created by Budha on 29/9/16.
 */

public class Estudiant extends Alumnat{
    private String nif;

    public Estudiant(String nom, String adresa, int edat, String dataAlta, String nif) {
        super(nom, adresa, edat, dataAlta);
        this.nif = nif;
    }
}
