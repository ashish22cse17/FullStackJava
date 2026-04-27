
class A {
    public void show() {
        System.out.println("ashish A");
    }
}

// class B extends A {
//     public void show() {
//         System.out.println("ashish B");
//     }

// }
public class Anonynmousclass {
    public static void main(String args[]) {
        A obj =new A(){
            public void show() {
            System.out.println("ashish new"); //anonymous class
    }
        };
        obj.show();
    }
}

