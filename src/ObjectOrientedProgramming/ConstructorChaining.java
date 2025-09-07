package ObjectOrientedProgramming;

public class ConstructorChaining {
    ConstructorChaining(){
       // this(a);
        System.out.println("default constructor");
    }
    ConstructorChaining(int a){
        this("djfah");
        System.out.println(a);
    }
    ConstructorChaining( String name){
        System.out.println(name);
      //  System.out.println(age);

    }

    public static void main(String[] args) {
        ConstructorChaining obj = new ConstructorChaining();

    }
}
