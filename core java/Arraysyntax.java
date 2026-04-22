import java.util.Scanner;

public class Arraysyntax {
    public static void main(String[] args) {
        int arr[]=new int[3];
        Scanner sc= new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println(arr[0]);
    }
}
