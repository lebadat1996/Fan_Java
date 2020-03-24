package Fan;

public class Fan {
    final private int slow = 1;
    final private int medium = 2;
    final private int fast = 3;
    private int speed = slow;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public Fan() {

    }

    public int getSlow() {
        return slow;
    }

    public int getMedium() {
        return medium;
    }

    public int getFast() {
        return fast;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return true;
    }

    public boolean  isOff(){
        return false;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String toString(){
        if (this.on) {
            return "speed: " + this.speed + " ; color: " + this.color + " ; radius: " + this.radius + " ; fan is on";
        } else {
            return "color: " + this.color + " ; radius: " + this.radius + " ; fan is off";
        }
    }
}
