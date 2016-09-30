package Act1_Agenda;

/**
 * Created by Budha on 22/9/16.
 */

public class Pagina {

    private int dia;
    private int mes;
    private boolean festiu;

    //Constructor
    public Pagina(int dia, int mes, boolean festiu) {
        this.dia = dia;
        this.mes = mes;
        this.festiu = festiu;
    }


    public void afegirCita(){

    }

    public void esborrarCita(){

    }

    public void cercarCita(){

    }

    public void llistarCites(){

    }


    //Get and Set
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public boolean isFestiu() {
        return festiu;
    }

    public void setFestiu(boolean festiu) {
        this.festiu = festiu;
    }

}
