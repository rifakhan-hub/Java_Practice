package If_else;

import java.util.Scanner;

public class Gender1314 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter M or F");
        char gender = sc.nextLine().charAt(0);
        if (gender=='M' || gender=='m'){
        System.out.println("Good morning Sir ");
        } else if (gender=='F' || gender=='f') {
            System.out.println("Good morning Ma'am ");
        } else {
            System.out.println("Wrong Input");
        }

    }
}
