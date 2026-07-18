// Assignment 6.2
// Frederick Costello
// 07/18/2026
// File Name: FAN_Week_6.java
//
// Purpose: The purpose of this assignment is to create a class called Fan_Week_6 that represents a fan with various attributes and methods.
//  The class includes constants for different fan speeds, instance variables for speed, on/off status, radius, and color, as well as getter and 
// setter methods for each attribute. Additionally, the class has a constructor to initialize the fan's attributes and a toString method to 
// provide a string representation of the fan's status. The Main class demonstrates the usage of the Fan_Week_6 class by creating instances of 
// fans and displaying their attributes.
// Resources: Bellevue Videos "Darrell Payne", Apache Beans, Code Editor, Google, Copilot


public class FAN_Week_6 {
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    private int speed = STOPPED;
    private boolean on = false;
    private double radius = 6;
    private String color = "white";

    public int getSpeed() { return speed; }
    public void setSpeed(int speed) { this.speed = speed; }

    public boolean isOn() { return on; }
    public void setOn(boolean on) { this.on = on; }

    public double getRadius() { return radius; }
    public void setRadius(double radius) { this.radius = radius; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public FAN_Week_6() {
        speed = STOPPED;
        on = false;
        radius = 6;
        color = "white";
    }
public FAN_Week_6(int speed, boolean on, double radius, String color) {
    this.speed = speed;
    this.on = on;
    this.radius = radius;
    this.color = color;
}
public String toString() {
    return ", Fan status -> Speed: " + speed +
            ", On: " + on +
            ", Radius: " + radius +
            ", Color: " + color;
    }
}
    class Main {
        public static void main(String[] args) {
            FAN_Week_6 fan1 = new FAN_Week_6();
            
            FAN_Week_6 fan2 = new FAN_Week_6(FAN_Week_6.FAST, true, 10, "blue");
            System.out.println(fan2.toString());

            fan1.setSpeed(FAN_Week_6.MEDIUM);
            fan1.setColor("green");
            System.out.println("Updated fan1 -> " + fan1.toString());
    }

}
