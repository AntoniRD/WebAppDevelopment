package Act10_Singleton;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 * Created by Budha on 14/10/16.
 */

public class LogFile extends LogAbstract {
    public void logInfo(String textToLog) {
        if (isLogInfo()) {
            writeFile(INFO_PREFIX + textToLog);
        }


    }

    public void logWarn(String textToLog) {
        if (isLogWarn()) {
            writeFile(WARN_PREFIX + textToLog);
        }

    }

    public void logError(String textToLog) {
        if (isLogError()) {
            writeFile(ERROR_PREFIX + textToLog);
        }


    }

    private void writeFile(String text) {
        PrintWriter writer = null;
        try {
            writer = new PrintWriter("log.log", "UTF-8");
            writer.println(text);
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }



    //variable global
    private static Log logSingleton = null;

    private LogFile(){}

    private synchronized static void createInstance(){
        if (logSingleton == null){
            //logSingleton = new LogFile();
            //logSingleton = (Log) new LogFile();
        }
    }

    public static Log getInstance(){
        if (logSingleton == null) createInstance();
        return logSingleton;
    }

}
