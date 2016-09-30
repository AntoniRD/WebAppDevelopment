package Act2_GarbageCollector;

import java.util.ArrayList;


/**
 * Created by Budha on 23/9/16.
 */

public class Garbage {

    protected void finalize(){
        try{
            Thread.sleep(10000);
            System.out.println("Mentres esperam, va fent coses per darrera");
        } catch (Throwable throwable){
            throwable.printStackTrace();
        }
    }

}