package patterns.command;

public class Light {

    private String lightLevel;

    public Light() {
        this.lightLevel = "OFF";
    }

    public void turnOn() {
        System.out.println("The light is on");
        this.lightLevel = "ON";
    }

    public void turnOff() {
        System.out.println("The light is off");
        this.lightLevel = "OFF";
    }


    public String getLightLevel() {
        return this.lightLevel;
    }

    public void setLightLevel(String lightLevel) {
        this.lightLevel = lightLevel;
    }


}
