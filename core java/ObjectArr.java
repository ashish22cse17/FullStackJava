class Students{
    int roll;
    String name;
    int marks;
}
public class ObjectArr {
    public static void main(String[] args){
        Students sc=new Students();
        sc.name="ashish";
        sc.roll=34;
        sc.marks=45;

        Students sc1=new Students();
        sc1.name="loge";
        sc1.roll=78;
        sc1.marks=45;
        System.out.println(sc);

        Students arr[]=new Students[2];
        arr[0]=sc;
        arr[1]=sc1;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].name);
            
        }
        //foreach loop
        for(Students std:arr){
            System.out.println(std.roll);
        }
    }
}
