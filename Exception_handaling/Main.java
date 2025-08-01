package Exception_handaling;

public class Main {
       public static void main(String[] args) {

        try {
            int a = 10 / 0;
            } catch (Exception e) {
             System.out.println("Some error occurred: " + e.getMessage());
}
        
       }
    
}
