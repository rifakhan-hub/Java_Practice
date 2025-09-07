package Switch;

import java.util.Scanner;

public class Game44 {
    public static void main(String[] args) {
        int guess = (int) (Math.random() * 100) + 1;  // for any randon no.
        Scanner sc = new Scanner(System.in);
//        System.out.println((int)(Math.random() * 100) + 1);
        int userGuess;
        int maxGuess =9;
        System.out.println("guess userGuess number  between 1 - 100");
        do {
            userGuess = sc.nextInt();
            if (userGuess == guess) {
                System.out.println("winner winner chicken dinner");
                break;
            }
            if (--maxGuess == 0){
                System.out.println("you lost");
                break;
            }
            if (userGuess < guess) System.out.println("thoda bada socho");
            else System.out.println("thoda chhota socho");
        } while (true);

    }
}
