import java.util.Scanner;

public class Strinjava {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name="adarsh"; //or String name=new String("Ashish");
        System.out.println(name);
        char nuy[]=new char[10];
        for (int index = 0; index < nuy.length; index++) {
            nuy[index]=sc.next().charAt(0);
        }
        for (char c : nuy) {
            System.out.print(c);
        }

       
    }
}
