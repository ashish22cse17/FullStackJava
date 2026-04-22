
public class Conditonal {
    public static void main(String[] args) {
        // we have mainly if else and switch statement are conditional statement 
        int age =34;
        if(age>18){
            System.out.println("you are a  voter");
           
        } else{
                System.out.println("not a voter");
            }

            //another way to do same is using ternary opeerator 
            boolean g=age>18?true:false;
            System.out.println(g);
    }
}