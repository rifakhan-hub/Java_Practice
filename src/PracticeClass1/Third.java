package PracticeClass1;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         double amt = sc.nextDouble();


         if (amt>=500){
             int no500= (int) amt/500;
             amt=amt%500;
         }
        if (amt>=500){
            int no500= (int) amt/500;
            amt=amt%500;
        }
        if (amt>=200){
            int no200= (int) amt/200;
            amt=amt%200;
        }
        if (amt>=100){
            int no100= (int) amt/100;
            amt=amt%100;
        }
        if (amt>=50){
            int no50= (int) amt/50;
            amt=amt%50;
        }
        if (amt>=20){
            int no20= (int) amt/20;
            amt=amt%20;
        }
        if (amt>=10){
            int no10= (int) amt/10;
            amt=amt%10;
        }
        if (amt>=5){
            int no5= (int) amt/5;
            amt=amt%5;
        }
        if (amt>=2){
            int no2= (int) amt/2;
            amt=amt%2;
        }
        if (amt>=1){
            int no1= (int) amt/1;
            amt=amt%1;
        }

//        System.out.println(500+" note appear "+ no500+ "gh");

//         if (amt>=500) System.out.println((amt-(amt%500))/500);
//         if(amt>=200) System.out.println((amt-(amt%200))/200);
//        if(amt>=100) System.out.println((amt-(amt%100))/100);
//        if(amt>=50) System.out.println((amt-(amt%50))/50);

    }
}
