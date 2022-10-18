package patterns.state;

public class Main {
    public static void main(String[] args) {
        // State Pattern
        // Very similar to the Strategy Pattern?

        UserStory userStory = new UserStory();
        System.out.println(userStory.getState().toString());

        userStory.startWorkingOn();
        System.out.println(userStory.getState().toString());

        userStory.stopWorkingOn();
        System.out.println(userStory.getState().toString());

        userStory.finishWorkingOn();
        System.out.println(userStory.getState().toString());
    }
}
