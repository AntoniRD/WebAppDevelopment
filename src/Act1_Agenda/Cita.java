package Act1_Agenda;

/**
 * Created by Budha on 22/9/16.
 */

public class Cita {

    private float hInici;
    private float hFi;
    private String motiu, contingut;

    //Constructor
    public Cita(float hInici, float hFi, String motiu, String contingut) {
        this.hInici = hInici;
        this.hFi = hFi;
        this.motiu = motiu;
        this.contingut = contingut;
    }


    //Get and Set
    public float gethInici() {
        return hInici;
    }

    public void sethInici(float hInici) {
        this.hInici = hInici;
    }

    public float gethFi() {
        return hFi;
    }

    public void sethFi(float hFi) {
        this.hFi = hFi;
    }

    public String getMotiu() {
        return motiu;
    }

    public void setMotiu(String motiu) {
        this.motiu = motiu;
    }
}
