package ua.com.alevel.config;

import ua.com.alevel.db.CarDB;
import ua.com.alevel.db.CarListBD;
import ua.com.alevel.db.CarSetDB;

public class DBConfig {

    private static final String DB_SET = "set";
    private static final String DB_LIST = "list";

    private CarDB carDB;

    private static DBConfig instance;

    private DBConfig() { }

    public static DBConfig getInstance() {
        if (instance == null) {
            instance = new DBConfig();
        }
        return instance;
    }

    public void configure(String dbType) {
        switch (dbType) {
            case DB_LIST -> this.carDB = new CarListBD();
            case DB_SET -> this.carDB = new CarSetDB();
        }
    }

    public CarDB getCarDb() {
        return this.carDB;
    }
}
