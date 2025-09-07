package Loop;

import java.util.Scanner;

//import static java.lang.StringTemplate.STR;

public class Factorial28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find its factorial");
        int n = sc.nextInt();
        long fact=1;
        for (int i = n; i>=1; i-- ){
            fact = fact*i;
        }
        System.out.println("the factorial of "+n+ " is "+fact);
       //System.out.println(STR."factorial of \{n} = \{fact}");
    }
}
