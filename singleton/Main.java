package patterns.singleton;

public class Main {

  // Main entry point to the program
  public static void main(String[] args) {

    // Singleton Design Pattern
    DatabaseConnection myDatabaseConnection = DatabaseConnection.getInstance();
    myDatabaseConnection.getConnectionId(); // print something

    myDatabaseConnection = DatabaseConnection.getInstance();
    myDatabaseConnection.getConnectionId();

    myDatabaseConnection = DatabaseConnection.getInstance();
    myDatabaseConnection.getConnectionId();

    DatabaseConnection myDatabaseConnection2 = DatabaseConnection.getInstance();
    myDatabaseConnection2.getConnectionId();

//    DatabaseConnection test = new DatabaseConnection();


  }
}
