class InnerConstructor {
    int age;
    String name;

    public  InnerConstructor(){// deafult constructor
        age=12;
        name="Ashish Ranjan"; 
        System.out.println("in constructor");
    }
     public  InnerConstructor(int age,String name){// parameterized constructor
        this.age=age;
        this.name=name; 
        System.out.println("in constructor");
    }

}
public class Constructor {
    
    public static void main(String[] args) {
        InnerConstructor obj=new InnerConstructor(34,"laal");
        System.out.println(obj.age);
        System.out.println(obj.name);

    }
}
