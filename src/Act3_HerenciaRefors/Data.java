package Act3_HerenciaRefors;

/**
 * Created by Budha on 28/9/16.
 */

/*
1. Reflexiona sobre les linies marcades amb #1 i #2.
2. Implementa una nova classe anomenada AnyDeTrespas que determini si una determinada data pertany a un any de trespàs
(per simplificar l'algoritmia considerarem que els anys de trespàs son tots els anys parells). Reflexiona sobre:
    2.1. A què pots accedir de la superclasse?
        A les clases.
    2.2. A què no pots accedir?
        A les variables privades.
3. Ara canvia la implementació de la classe Data. Fes-la amb la representació de la data amb tres atributs enters.
    3.1. Segueix funcionant la classe AnyDeTrespas ?
    3.2. Què hauria passat si per algun motiu haguesis pogut emprar el mètode privat descomposaData.
*/

public class Data {

    //#1
    private static final String SEPARADOR = "-"; //per tot on s'emplei canviara.
    //private String data; //original
    private int dia, mes, any;

    public String getData() {
        //return data; //original
        return dia + SEPARADOR + mes + SEPARADOR + any;
    }

    public void setData(String data) throws Exception {
        //#2
        if (!data.contains(SEPARADOR)) throw new Exception();
        //this.data = data; //original
        this.dia = descomposaData()[0];
        this.mes = descomposaData()[1];
        this.any = descomposaData()[2];

        /*
        Posible solucio
        int[] dates = descomposaData();
        this.dia = descomposaData()[0];
        this.mes = descomposaData()[1];
        this.any = descomposaData()[2];
        */

    }

    public int getAny(){
        //return data != null ? descomposaData()[2] : 0; //original
        return any;
    }

    private int[] descomposaData(){ //private int[] descomposaData(String data)

        //String[] dataDescomposada = data.split(SEPARADOR); //original
        String [] dataDescomposada = getData().split(SEPARADOR); //canvi de l'original
        int[] dataDescomposadaInt = new int[dataDescomposada.length];
        dataDescomposadaInt[0] = Integer.parseInt(dataDescomposada[0]);
        dataDescomposadaInt[1] = Integer.parseInt(dataDescomposada[1]);
        dataDescomposadaInt[2] = Integer.parseInt(dataDescomposada[2]);

        return dataDescomposadaInt;

    }
}