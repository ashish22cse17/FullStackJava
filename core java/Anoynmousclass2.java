abstract class InnerAnoynmousclass2 {

    public abstract void display();
}
public class Anoynmousclass2 {
    public static void main(String[] args) {
        InnerAnoynmousclass2 i = new InnerAnoynmousclass2() {
            @Override
            public void display() {
                System.out.println("This is an anonymous class");
            }
        };
        i.display();
    }
    
}
