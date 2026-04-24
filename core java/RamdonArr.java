
import java.util.Scanner;

public class RamdonArr {
    public static void main(String[] args) {
       //jaggeed array
       Scanner svc=new Scanner(System.in);
       int arr[][]=new int[3][];
        arr[0]=new int[3];
        arr[1]=new int[2];
        arr[2]=new int[4];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]=svc.nextInt();
            }
        }
        for (int[] is : arr) {
            for (int is2 : is) {
                System.out.print(is2);
            }
            System.out.println();
        }
        svc.close();
    }
}
