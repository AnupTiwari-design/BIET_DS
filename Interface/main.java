package interface;

public class Main {
    public static void main(String[] args) {
        Vehicle v = new Car();  // Interface reference, Car object
        v.start();  // Output: Car starts with a key
    }
}