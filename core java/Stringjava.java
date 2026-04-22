public class Stringjava {
    public static void main(String[] args) {
        String name="navin"; // it immutable means String is immutable if you append any thing it will crete a new string and chage the pointer value in the main stack
        
        // where as both string buffer and string builder are mutable which means you can change in original string itself..
        // both string buffer and are also differentiate based on the thread one is thread safe other is not..

        StringBuffer name1=new StringBuffer("ashish ranjan");
        StringBuilder name2=new StringBuilder("vishal kumar");
        name1.capacity();
        name1.length();

        // predefine function are there like length and so many expolore all other funtion 
        
    }
}
