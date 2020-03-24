package Fan;

public class main {
    public static void main(String[] args) {
        System.out.println("Fan 1: ");
        Fan fan1 = new Fan();
        System.out.println(fan1.isOn());
        System.out.println("speed = "+ fan1.getFast());
        fan1.setRadius(10);
        System.out.println(fan1.getRadius());
        fan1.setColor("yellow");
        System.out.println("color: "+ fan1.getColor());



        System.out.println("Fan2: ");
        Fan fan2 = new Fan();
        System.out.println(fan2.isOff());
        System.out.println("speed = "+ fan2.getMedium());
        fan1.setRadius(5);
        System.out.println(fan1.getRadius());
        fan1.setColor("blue");Fan
        System.out.println("color: "+ fan1.getColor());
    }
}
