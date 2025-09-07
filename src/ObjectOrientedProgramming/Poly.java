package ObjectOrientedProgramming;

// in polymorphism multiple function must have same name
// method overloading can be achieved with change in no. of parameter, order or tyoe of variable

public class Poly {
    static void add(int a, int b){
        System.out.println(a+b);
    }
    static void add(int a, int b, int c){
        System.out.println(a+b+c);
    }
    static void add(String c, int a, int b){
        System.out.println(a+b+c);
    }

    public static void main(String[] args) {

    }
}
