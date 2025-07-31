package polymorphism;

public class student extends Person{

   public void display(){
        System.out.println("child class called");
    }

    public static void main(String[] args) {
        student ob=new student();
        ob.display();
    }
    
}
