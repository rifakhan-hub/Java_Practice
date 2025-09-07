package ObjectOrientedProgramming;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ExceptionHandling {
    public static void main(String[] args) { // checked exception handling - at compile time
                                             // unchecked - at runtime
        int arr[][] = new int[3][2];
        System.out.println("hello");
        String s = null;

        try{    // here we will call , jahan pr exception ane ka chance h\
                // without catch or finally try is not possible
            System.out.println(1/0);
        }catch (Exception obj){   // it is a constructor or special kind of method jahn pr hume parameters paas krna padhega
            // agr hume nhi pata kis type ka exception h to just write "Exception" as in the parameter to create object
            // Exception is parent class of many kind of exception

            System.out.println(obj.toString());
            System.out.println(obj.getMessage());
            System.out.println(obj.getCause());

        } finally { // exception aaye an aaye yeh toh chalega
            System.out.println("hum toh chalenge");
        }

        System.out.println("kjhuk");
        System.out.println("kjhuk");
        System.out.println("kjhuk");
    }
}
