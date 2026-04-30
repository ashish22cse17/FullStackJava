
class A /* extends Object */ {// extends Object invisble extend
   public A() {
      System.out.println("in A");
   }

   public A(int n) {
      System.out.println("int wala constr A");
   }

}

class B extends A {
   public B() {
      super(); // this calling parent class construtor (default) all constructor have
               // invisible...
      System.out.println("in B");
   }

   public B(int n) {
      // super();
      this();
      System.out.println("constuct B with int");
   }
}

public class Constructorinheri {
   public static void main(String[] args) {
      B df = new B(8);

   }
}