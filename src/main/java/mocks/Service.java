package mocks;

public class Service {
    private Database database;

    public Service(Database database) {
        this.database = database;
    }

//    If it ran one time or not
    public boolean query(String query) {
        return database.isAvailable();
    }


    @Override
    public String toString() {
        return "Using database with id: " + String.valueOf(database.getUniqueId());
    }
}
