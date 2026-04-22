import java.util.Scanner;

public class TwoDarr {
    public static void main(String[] args) {
        int arr[][]=new int[3][3];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j < arr.length; j++) {
        //         System.out.print(arr[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        //using foreach loop
        for (int[] is : arr) {
            for (int is2 : is) {
                System.out.print(is2);
            }
            System.out.println();
        }
        System.out.println(Math.random()); //it generates random values for 0 to 1;
    }
}
