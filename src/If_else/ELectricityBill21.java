package If_else;

import java.util.Scanner;

public class ELectricityBill21 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int unit = sc.nextInt();
//        int u100=420; int u200=1020; int u400= 2620;

        if (unit<=100) System.out.println(unit*4.2);
        else if (unit<=200) System.out.println(420 + (unit-100)*6 );
        else if (unit<=400) System.out.println(1020 + (unit-200)*8 );
        else  System.out.println(2620+ (unit-400)*13);

    }
}
