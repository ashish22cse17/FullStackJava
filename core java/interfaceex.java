interface Innerinterfaceex {
    int a=10; // by default it is public static final
    String name="mumbai"; // by default it is public static final
    void show(); 
    void display();

}

class Impl implements Innerinterfaceex {

    public void show() {
        System.out.println("This is show method");
    }

    public void display() {
        System.out.println("This is display method");
    }

}

public class interfaceex {
    public static void main(String[] args) {
        Impl ie=new Impl();
        ie.show();
        ie.display();
        System.out.println(Innerinterfaceex.a);
        System.out.println(Innerinterfaceex.name);
    }

    
}
