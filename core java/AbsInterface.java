interface Computer{
    void code();
} 
//works same as abstract class but we can not create object of interface and we can not declare constructor in interface and all the method in interface are by default abstract and public
// abstract class Computer {
//     public abstract void code();
// }
class Laptop implements Computer{
    public void code(){
        System.out.println("Laptop is coding");
    }
}
class Desktop implements Computer{
    public void code(){
        System.out.println("Desktop is coding");
    }
}

class Developer{
    void work(Computer s){
       s.code();
    } 
}
public class AbsInterface {
    public static void main(String[] args) {
        Computer obj=new Desktop();
        Computer obj1=new Laptop();
        Developer ashish=new Developer();
        ashish.work(obj);
    }
    
}
