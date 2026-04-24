class Calc{
    //type of inhertance mutli level and single level inheritance
    public void add(){
        System.out.println("in addition");
    }
    public void sub(){
        System.out.println("in subtraction");
    }
}
class Advcalc extends Calc{
    public void multiply(){
        System.out.println("in multiply");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Advcalc df= new Advcalc();
        df.add();
    }
    
}
