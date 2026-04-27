
 class A {
    public void show() {
        System.out.println("I am A");
    } 
}
 class B extends A {
    public void show1() {
        System.out.println("I am B");
    }

}
public class Typecasting {
    public static void main(String[] args) {
        A obj = new B();
        obj.show(); // B's show method will be called
        B obj1 = (B)obj; // Upcasting: B is being treated as A             
        obj1.show1(); // B's show method will be called due to dynamic method dispatch  
        //obj1.show1();
    }
}