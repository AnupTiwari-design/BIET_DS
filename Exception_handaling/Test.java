package Exception_handaling;

public class Test {

    public static void main(String[] args) {
        
        int age=15;
        if(age<18){
            throw new ArithmeticException("Not eligible to vote");
        }
        System.out.println("Eligible to vote");
    }
    
}
