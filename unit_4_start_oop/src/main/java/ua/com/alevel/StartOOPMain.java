package ua.com.alevel;

import ua.com.alevel.config.DBConfig;

public class StartOOPMain {

    public static void main(String[] args) {
        DBConfig.getInstance().configure(args[0]);
        ProgramRun.start();
    }
}
