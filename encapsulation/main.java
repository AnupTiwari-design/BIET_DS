package encapsulation;

public class main {
  public static void main(String[] args) {
        Student s = new Student();

        s.setName("Anup");
        s.setAge(82);

        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
    }   
}
