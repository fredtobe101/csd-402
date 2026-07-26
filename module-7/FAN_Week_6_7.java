// Assignment 7.2: Programming Assignment
//Fred Costello 
// 07/25/2026
//CSD-402

// This program creates a Fan class with properties for speed, on/off state, radius, and color. 
// It includes methods to get and set these properties, as well as constructors for default and parameterized initialization. 
// The UseFans class demonstrates creating multiple Fan objects and displaying their properties.

//Reference: https://www.geeksforgeeks.org/java-program-to-create-a-fan-class/, 
// https://www.w3schools.com/java/java_classes.asp, Bellevue University Professor Darrell Payne Instructional video's, Google,Copilot



import java.util.ArrayList;
import java.util.List;

public class FAN_Week_6_7 {

    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public int getSpeed() { return this.speed; }
    public void setSpeed(int speed) { this.speed = speed; }

    public boolean isOn() { return this.on; }
    public void setOn(boolean on) { this.on = on; }

    public double getRadius() { return this.radius; }
    public void setRadius(double radius) { this.radius = radius; }

    public String getColor() { return this.color; }
    public void setColor(String color) { this.color = color; }

    public FAN_Week_6_7() {
        this.speed = STOPPED;
        this.on = false;
        this.radius = 5.0;
        this.color = "white";
    }

    public FAN_Week_6_7(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }
}
 //-------------------------------------------------------------------

class UseFans {
                        //Test code
    public static void displayFan(FAN_Week_6_7 fan) {
        System.out.println("Fan -> Speed: " + fan.getSpeed() +
                ", On: " + fan.isOn() +
                ", Radius: " + fan.getRadius() +
                ", Color: " + fan.getColor());
    }

    public static void displayFans(List<FAN_Week_6_7> fans) {
        for (FAN_Week_6_7 fan : fans) {
            displayFan(fan);
        }
    }

    public static void main(String[] args) {

        List<FAN_Week_6_7> fans = new ArrayList<>();

        FAN_Week_6_7 fan1 = new FAN_Week_6_7();
        FAN_Week_6_7 fan2 = new FAN_Week_6_7(FAN_Week_6_7.FAST, true, 10.0, "yellow");
        FAN_Week_6_7 fan3 = new FAN_Week_6_7(FAN_Week_6_7.MEDIUM, false, 5.0, "blue");

        fans.add(fan1);
        fans.add(fan2);
        fans.add(fan3);

        System.out.println("Displaying Fans:");
        displayFans(fans);
    }
}
