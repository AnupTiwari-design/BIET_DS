package inheritance;

public class B {

    void display(A v){
        System.out.println(v.a);
    }

    public static void main(String[] args) {
        A ob1=new A();
        B ob=new B();
        ob.display(ob1);
    }
    
}
