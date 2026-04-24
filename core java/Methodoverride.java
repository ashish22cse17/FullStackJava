class A {
    public void show() {
        System.out.println("I am A");
    }
    public void display() {
        System.out.println("I am display method of A");
    }
}

class B extends A {
    public void show() {
        System.out.println("I am B");
    }
}
public class Methodoverride {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
        obj.display();

    }
}
