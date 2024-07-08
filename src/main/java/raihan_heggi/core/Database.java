package raihan_heggi.core;

public class Database {
    
    // Private Constructor
    private static Database database;

    // Checking for singleton implementation
    public static Database getInstance(){
        if(database == null){
            database = new Database();
        }

        return database;
    }

    private Database(){

    }


}
