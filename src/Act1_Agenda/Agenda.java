package Act1_Agenda;

import java.util.List;

/**
 * Created by Budha on 22/9/16.
 */

public class Agenda {

    private int any;
    private List <Pagina> pagina;

    //Constructor
    public Agenda(int any, List<Pagina> pagina) {
        this.any = any;
        this.pagina = pagina;
    }


    public void avazarPagina(){

    }

    public void retrocedirPagina(){

    }

    public void llegirPagina(){

    }


    //Get and Set
    public int getAny() {
        return any;
    }

    public void setAny(int any) {
        this.any = any;
    }

    public List<Pagina> getPagina() {
        return pagina;
    }

    public void setPagina(List<Pagina> pagina) {
        this.pagina = pagina;
    }
}
