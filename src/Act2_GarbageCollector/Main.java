package Act2_GarbageCollector;

/**
 * Created by Budha on 23/9/16.
 */

public class Main {

    public static void main (String[] args){

        Garbage gc = new Garbage(); //inicialitzam l'objecte, pero com no te constructor no entra

        try {
            Thread.sleep(10000);
            System.out.println("Esperam per primera vegada");
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Borram memoria de l'objecte");
        gc = null; //Posam es valor de l'objecte a null

        System.gc();


        try{
            Thread.sleep(10000);
            System.out.println("Esperam per darrera vegada");
        } catch (Throwable throwable){
            throwable.printStackTrace();
        }

    }

}
