
 class A { // final class cannot be inherited
     public final void show() {
        System.out.println("I am A");
    }

    public void add(int a, int b) {
        show();
        System.out.println(a + b);
    }

}
class B extends A {
    // public void show() { // error: cannot override the final method from A
    //     System.out.println("I am B");
    // }
}   

public class Final {
    public static void main(String[] args) {
        // final int a = 10; // final variable
        // // a = 20; // error: cannot assign a value to final variable a
        A obj = new A();
        obj.show();
        obj.add(5, 10);
    }
}