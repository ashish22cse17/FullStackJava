interface B {
    int sum(int a, int b);
}

// class A implements B {
//     @Override
//     public int sum(int a, int b) {

//         return a+b;
//     }
// }

public class lemdaexp {
    
    public static void main(String[] args) {
        B sc=( i,j)->i+j;
        int ij=sc.sum(5,8);
        System.out.println(ij);
    }
}
