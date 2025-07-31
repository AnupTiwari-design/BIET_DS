package Abstraction;

public class Working extends fan {


    public void on() {
        System.out.println("fan is on");
    }


    public void off() {
        System.out.println("fan is off");
    }

    public static void main(String[] args) {
        Working ob = new Working();
        ob.on();
        ob.off();
        ob.display(); 
}
}