package PracticeClass1;

import java.util.Scanner;

public class Ninth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number of factors ");
        int n = sc.nextInt();

        System.out.println("enter the outer range");
        int x = sc.nextInt();
        int count=0;

        for (int i=1; i<=x; i++){
            int temp=1;
            for( int j=1; j<=i/2; j++){
                int fact= i%j;
                if(fact==0){
                    temp++;
                }
            }
            System.out.println(i+ " have "+ temp + " divisors");
            if (temp==n) count++;
        }
        System.out.println("count = " + count);
    }
}
