package org.example.HW6;
/*
Реализация простого программного логгера с применением паттерна Singleton
*/
public class Logger {
    private static Logger logger;
    private static String logFile = "Логгер файла \n\n";
    public static Logger getLogger(){
        if(logger == null){
            logger = new Logger();
        }
        return logger;
    }

    public Logger() {}
    public void addLogNote(String logNote){
        logFile += logNote + "\n";
    }
    public void showLogFile(){
        System.out.println(logFile);
    }
}
