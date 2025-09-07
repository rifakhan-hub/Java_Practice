package Loop;

import java.util.Scanner;

public class ReverseNum36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        long n = sc.nextLong();
        long reverse = 0;
        while  (n!=0){
            long rem = n % 10;
            reverse = reverse * 10 +rem;
            n= n / 10;
        }
        System.out.println(reverse);


//        while (a>0){
//            System.out.print(a%10);
//            a/=10;
//        }

    }
}
