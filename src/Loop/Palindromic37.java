package Loop;

import java.util.Scanner;

public class Palindromic37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        long n = sc.nextLong();
        long reverse = 0;
        long temp = n;
        while  (n!=0){
            long rem = n % 10;
            reverse = reverse * 10 +rem;
            n= n / 10;
        }
        System.out.println(reverse== temp ? "palindrome" : "Not Palindrome");

    }
}
