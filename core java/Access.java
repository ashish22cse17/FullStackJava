
// public can be used form any where but not private and default can be used only in the same class and protected can be used in the same package and also in the subclass of other package.   
class Inneraccess {
private int data = 30;
int data2 = 40; 
public int year=4545;

void display()
{
    System.out.println("data is "+data);
}
}
public class Access {
public static void main(String[] args) {
    Inneraccess obj = new Inneraccess();
        System.out.println(obj.data2);
        System.out.println(obj.year);   
    obj.display(); 
}
}

