package Act4_Herencia;

/**
 * Created by Budha on 29/9/16.
 */

public class Treballador extends Persona{
    private String numSs;

    public Treballador(String nom, String adresa, String numSs) {
        super(nom, adresa);
        this.numSs = numSs;
    }
}
