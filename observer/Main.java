package patterns.observer;

public class Main {
    public static void main(String[] args) {
        // Ferrari dealer announces an update!
        Dealer ferrariDealer = new Dealer("Ferrari");

        // Create 50 Ferrari instances that care about the data changing!
        for (int i = 0; i < 50; i++) {
            new Ferrari("Ferrari #" + i, ferrariDealer);
        }

        // A new update was released!
        // This will let all the Ferrari owners know there is a new update!
        ferrariDealer.setLatestFerrariUpdate("Apple integration 102 update.");
    }
}
