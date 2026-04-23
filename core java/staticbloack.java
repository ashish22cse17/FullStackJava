class Mobile {

    String name;
    int price;
    static String network;
    static{
        network="4g";

    }
   
    public void Display(){
        System.out.println(name + price + network);
    }
    
}
public class staticbloack {
    public static void main(String[] args) {
        Mobile obj=new Mobile();
        //Mobile.network="5G"; //static variable is called with the classs name we can call with object but class name is prefered as correct...
        obj.name="redmi";
        obj.price=234;
        obj.Display();
    }
    
}
