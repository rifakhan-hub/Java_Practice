package String;

import java.util.Scanner;

public class Reverse72 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str= "hello";

        for (int i = str.length(); i > 0 ; i--) {
            System.out.print(str.charAt(i));
        }

    }
}
