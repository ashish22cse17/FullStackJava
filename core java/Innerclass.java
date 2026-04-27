
class A {
int a;
public void show(){
    System.out.println("fgfgfgf");
}
static class B{
    public void dow(){
    System.out.println("fgfgfgf");
}
}
}
public class Innerclass {
    public static void main(String[] args) {
        A obj =new A();
        obj.show();
        // A.B obj2=obj.new B(); for non static class 
        // obj2.dow();
         A.B obj2=new A.B();// static inner class
         obj2.dow();
    }
}
