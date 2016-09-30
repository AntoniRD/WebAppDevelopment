package Act4_Herencia;

/**
 * Created by Budha on 29/9/16.
 */

public class Alumnat extends Persona{
    private int edat;
    private String dataAlta;

    public Alumnat(String nom, String adresa, int edat, String dataAlta) {
        super(nom, adresa);
        this.edat = edat;
        this.dataAlta = dataAlta;
    }
}
