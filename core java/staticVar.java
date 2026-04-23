class Mobile {

    String name;
    int price;
    static String network;
    public void Display(){
        System.out.println(name + price + network);
    }
    public static void pri(){
        System.out.println("static method called");
        // System.out.println(this.name + this.price + network);//uses static instance variable not use non static variable 
    }
}
public class staticVar {
    public static void main(String[] args) {
        Mobile obj=new Mobile();
        Mobile.network="5G"; //static variable is called with the classs name we can call with object but class name is prefered as correct...
        obj.name="redmi";
        obj.price=234;
        // Mobile.name
       // obj.network="4g";//this will update value of network in all created objects "bt not valid way to do as it is called using object not using class" 
        obj.Display();
        Mobile.pri(); //better to call with class name instead of calling with object
        obj.pri();
        
    }
}
