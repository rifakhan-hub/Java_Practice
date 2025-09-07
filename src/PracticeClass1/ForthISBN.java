package PracticeClass1;

import java.util.Scanner;

public class ForthISBN {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int rem =0;
        long t = n;
        int count =0;

        while (n>0){
            count++;
            n/=10;
        }
        if (count<10) System.out.println("not an ISBN number ");
        else {
            long sum =0;
            while(t>0){
                sum = sum + (t%10)*count;
                count--;
                t /= 10;
            }
            if (sum%11 == 0) System.out.println("the number is legal isbn");
            else System.out.println("not legal");
        }
    }
}
