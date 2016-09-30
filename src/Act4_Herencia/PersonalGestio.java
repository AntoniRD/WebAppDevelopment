package Act4_Herencia;

/**
 * Created by Budha on 29/9/16.
 */

public class PersonalGestio extends Treballador {
    private String posicio;

    public PersonalGestio(String nom, String adresa, String numSs, String posicio) {
        super(nom, adresa, numSs);
        this.posicio = posicio;
    }
}
