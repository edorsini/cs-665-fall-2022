package patterns.command;

public class Main {
    
    public static void main(final String[] arguments) {

        final Light lamp = new Light();

        final Command switchUp = new IncreaseLightCommand(lamp);
        final Command switchDown = new DecreaseLightCommand(lamp);

        final Switch mySwitch = new Switch();

        mySwitch.storeAndExecute(switchUp);
        mySwitch.storeAndExecute(switchDown);

    }

}
