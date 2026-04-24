class Human{
    public Human(){
        System.out.println("object created sucessfully");
    }
    int a=90; //instance variable 
    public void mat(){
        System.out.println("you are in human");
    }
}
public class objcreation {
    public static void main(String[] args) {
        new Human().mat(); //object creation only only use once anonymous
        Human hu=new Human(); //hu is refernce variable 
    }
    
}
