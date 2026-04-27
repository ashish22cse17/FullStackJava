final class Check{
    final int a=10;
    // a=45; not or as a is constant 
    public final void display(){
        System.out.println("Ashish here ");
    }
}
// class check2 extends Check not work beacaue class uses final 
public class finalkey {
    public static void main(String[] args) {
        Check ne=new Check();
    }
}
