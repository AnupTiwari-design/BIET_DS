package polymorphism;

public class overloading {


  public static void add(int a,int b){
        System.out.println(a+b);
    }

  public static void add(double c,int d){
        System.out.println(c+d);
    }
  public static void add(int a,int b,int c){
        System.out.println(a+b+c);
    }

    public static void main(String[] args) {
       add(6, 9);
        
    }
}
