package TheDependencyInversion;

public class PasswordReminder {
    private DBConnection dbConnection;
    public PasswordReminder(DBConnection dbConnection){
        this.dbConnection = dbConnection;
    }
}
