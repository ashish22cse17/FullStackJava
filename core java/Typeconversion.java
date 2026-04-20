public class Typeconversion{
    public static void main(String[] args){
        // bigger data are easy to convert but in case of conversion for big to small is losses some data called casting
        int a=356;
      //  byte b=a; //fails as byte is smaller size than int..
        byte c=(byte)a; //works as it is explicit /casting if number is more than 256 it will find number%256 
        System.out.print(c);
    }
}