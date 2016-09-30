package Act4_Herencia;

/**
 * Created by Budha on 29/9/16.
 */

public class Professor extends Treballador {
    private String titulacio, especialitat;

    public Professor(String nom, String adresa, String numSs, String titulacio, String especialitat) {
        super(nom, adresa, numSs);
        this.titulacio = titulacio;
        this.especialitat = especialitat;
    }
}
